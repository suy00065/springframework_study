package com.nhnacademy.edu.springframework.messagesender;

public class SmsMessageSender implements MessageSender {

    public SmsMessageSender() {
        System.out.println("SmsMessageSender initiated !");
    }

    public void init() {
        // System.out.println("SmsMessageSender init called !!");
        System.out.println("--------------- Sms init called ------------------");
    }

    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }
}
