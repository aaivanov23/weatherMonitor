package org.example.sendmessage;

public interface SendMessageInterface {
    void sendToTelegram(int temp);
    void sendToEmail(int temp, String emailAddress);
}
