package com.nhnacademy.edu.springframework.messagesender;

public class MessageSenderService {
    private final MessageSender messageSender;

    public MessageSenderService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void messageSend() {
        messageSender.sendMessage(new User("random@naver.com", "010-0000-0000"), "test 메시지1");
    }
}
