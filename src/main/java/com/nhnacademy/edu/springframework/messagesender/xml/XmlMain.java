package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSenderService;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlMain {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
            /*MessageSender emailSender = context.getBean("EmailMessageSender", MessageSender.class);
            MessageSender smsSender = context.getBean("SmsMessageSender", MessageSender.class);*/

            User user = new User("random@naver.com", "010-0000-0000");
/*            emailSender.sendMessage(user, "This is message");
            System.out.println("------------------");
            smsSender.sendMessage(user, "This is sms message");*/

            System.out.println();
            context.getBean("EmailMessageSender", MessageSender.class).sendMessage(user, "This is message");
            System.out.println("----------------------------------");
            context.getBean("EmailMessageSender", MessageSender.class).sendMessage(user, "This is message");
            System.out.println("----------------------------------");

            context.getBean("SmsMessageSender", MessageSender.class).sendMessage(user, "This is sms message");
            System.out.println("----------------------------------");
            context.getBean("SmsMessageSender", MessageSender.class).sendMessage(user, "This is sms message");
            System.out.println("----------------------------------");

        }
    }
}
