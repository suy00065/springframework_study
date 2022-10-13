package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.stereotype.Component;

@Component
public class SmsMessageSender implements MessageSender {

    public SmsMessageSender() {
        System.out.println("SmsMessageSender initiated ! 기본 생성자 호출");
    }

    public void init() {
        // System.out.println("SmsMessageSender init called !!");
        System.out.println("--------------- Sms init called ------------------");
    }

    public void shutdown() {
        System.out.println("----------------- Sms close -------------->");
    }

    public boolean sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
        return true;
    }
}
