package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        // 리팩토링에 유리
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(MainConfig.class, ServiceConfig.class);

        User user = new User("test1@naver.com", "010-0000-0000");

        MessageSenderService messageSenderService = MessageSenderService.class.cast(context2.getBean("messageSenderService"));
        messageSenderService.messageSend();
    }
}
