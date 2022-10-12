package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class MessageSenderService {

    private MessageSender messageSender;
    private List<MessageSender> messageSenders;

    //@Autowired
    public MessageSenderService(MessageSender messageSender) {
        System.out.println("------ Constructor Injection ------");
        this.messageSender = messageSender;
    }

    @Autowired
    public MessageSenderService(List<MessageSender> messageSenders) {
        this.messageSenders = messageSenders;
    }

    /*public MessageSenderService() {
        System.out.println("---------- Default Constructor Injection ----------");
    }*/

    /*@Autowired  // setter injection
    @Required
    public void setSmsMessageSender(MessageSender messageSender) {
        System.out.println("setMessageSender invoked!");
        this.messageSender = messageSender;
    }*/

    public void setMessageSender(MessageSender messageSender) {
        System.out.println("set by setMessageSender");
        this.messageSender = messageSender;
    }

    public void messageSend() {
        //messageSender.sendMessage(new User("random@naver.com", "010-0000-0000"), "test 메시지1");

        messageSenders.get(0).sendMessage(new User("random1@naver.com", "010-0000-0000"), "test 메시지1");
        messageSenders.get(1).sendMessage(new User("random2@naver.com", "010-1000-0000"), "test 메시지2");
    }
}
