package org.example.sendmessage;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.example.AppProperties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Properties;

public class SendMessage implements SendMessageInterface {
    private static final String URL = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";

    public void sendToTelegram(int temp){
        String url = String.format(URL,
                AppProperties.getProperties().getProperty("telegram.token"),
                AppProperties.getProperties().getProperty("telegram.chat_id"),
                String.format(AppProperties.getProperties().getProperty("message"), temp))
                .replace(" ", "%20");


        HttpResponse response = null;

        try {
            HttpClient httpClient = getHttpClient();
            HttpGet request = new HttpGet(url);
            response = httpClient.execute(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (response != null && response.getStatusLine().getStatusCode() != 200){
            System.out.println(response.getStatusLine().getStatusCode());
            throw new SendMessageException("Response code is not 200, please check logs");
        }

        //todo распарсить ответ в DTO и записать всё в лог (или записать в базу!)
    }

    @Override
    public void sendToEmail(int temp, String emailAddress) {
        //todo implement sending email to emailAddress (mail subject should be hardcoded)
        try {
            Properties properties = new Properties();
            properties.load(new BufferedReader(new InputStreamReader(new FileInputStream("/Users/alexei/IdeaProjects/Java/weatherMonitor/src/main/resources/mail.properties"))));
            Session session = Session.getDefaultInstance(properties);
            MimeMessage message = new MimeMessage(session);

            message.setSubject(String.format("Weather in %s", AppProperties.getProperties().getProperty("weatherbit.city")));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailAddress));
            message.setText(String.format(AppProperties.getProperties().getProperty("message"), temp));
            message.setSentDate(new Date());

            Transport t = session.getTransport();
            t.connect(properties.getProperty("mail.host"), 587, properties.getProperty("mail.user"), properties.getProperty("mail.password"));

            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
        } catch (IOException | MessagingException e) {
            e.printStackTrace();
        }
    }

    private HttpClient getHttpClient() {
        return HttpClientBuilder.create().build();
    }
}
