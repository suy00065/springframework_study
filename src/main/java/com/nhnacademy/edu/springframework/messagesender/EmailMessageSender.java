package com.nhnacademy.edu.springframework.messagesender;

public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("EmailMessageSender initiated ! 기본 생성자 호출");
    }

    public void init() {
        System.out.println("EmailMessageSender init called !!");
    }

    public void cleanup() {
        System.out.println("EmailMessageSender cleanup called :>");
    }
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);

    }
}
