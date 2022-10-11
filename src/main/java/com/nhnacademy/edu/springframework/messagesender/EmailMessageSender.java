package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("EmailMessageSender initiated !");
    }

    public void init() {
        System.out.println("EmailMessageSender init called !!");
    }
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);

    }
}
