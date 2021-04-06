package org.example;

import org.example.sendmessage.SendMessageException;
import org.example.sendmessage.SendMessageInterface;
import org.example.sendmessage.SendMessage;
import org.example.weatherbit.WeatherApi;
import org.example.weatherbit.dto.WeatherDTO;

import java.util.concurrent.TimeUnit;

public class WeatherMonitor {
    public static void main(String[] args) throws Exception {

        while (true) {
            WeatherApi api = new WeatherApi();
            WeatherDTO weather = api.sendRequest();
            double temp;

            if ((temp = weather.getData().get(0).getTemp()) <= -20.0 || temp > 25) {
                System.out.println("Temperature is " + temp);
                SendMessageInterface sender = new SendMessage();
                try {
                    sender.sendToTelegram((int) temp);
                } catch (SendMessageException e) {
                    sender.sendToEmail((int) temp, "alivanov152@gmail.com");
                }
                System.out.println("Message was sent");
            } else {
                System.out.println("Temperature is " + temp);
                System.out.println("Message was not sent");
            }
            TimeUnit.MINUTES.sleep(30);
        }
    }
}
