package com.nhnacademy.edu.springframework.messagesender;

public class MessageSenderService {
    private MessageSender messageSender;

    public MessageSenderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public MessageSenderService() {

    }

    public void setMessageSender(MessageSender messageSender) {
        System.out.println("set by setMessageSender");
        this.messageSender = messageSender;
    }

    public void messageSend() {
        messageSender.sendMessage(new User("random@naver.com", "010-0000-0000"), "test 메시지1");
    }
}
