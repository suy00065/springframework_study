package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.AOPConfig;
import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        // 리팩토링에 유리
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, ServiceConfig.class);

        MessageSenderService messageSenderService = MessageSenderService.class.cast(context.getBean("messageSenderService"));
        messageSenderService.messageSend();

        System.out.println("----------------------------------");

    }
}
