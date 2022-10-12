package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {
    public static void main(String[] args) {
        String basePackage = "com.nhnacademy.edu.springframework.messagesender" ;
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(basePackage);

        MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);
        MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);

        // 리팩토링에 유리
        /*AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(MainConfig.class);

        MessageSender emailMessageSender2 = MessageSender.class.cast(context2.getBean("emailMessageSender"));
        MessageSender smsMessageSender2 = MessageSender.class.cast(context2.getBean("smsMessageSender"));*/

        User user = new User("test1@naver.com", "010-0000-0000");
        smsMessageSender.sendMessage(user, "sms 메시지 테스트 내용");
        emailMessageSender.sendMessage(user, "이메일 메시지 테스트 내용");


    }
}
