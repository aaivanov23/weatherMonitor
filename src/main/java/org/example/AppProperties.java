package org.example;

import org.example.sendmessage.SendMessage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {
    private static Properties properties = null;

    static {
        try(InputStream fileStream = SendMessage.class.getClassLoader().getResourceAsStream("application.properties")) {
            properties = new Properties();
            properties.load(fileStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Properties getProperties() {
        return properties;
    }
}
