package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.AOPConfig;
import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import org.aspectj.bridge.Message;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, ServiceConfig.class, AOPConfig.class);

        MessageSenderService messageSenderService = MessageSenderService.class.cast(context.getBean("messageSenderService"));
        messageSenderService.messageSend();

        System.out.println("----------------------------------");
    }
}
