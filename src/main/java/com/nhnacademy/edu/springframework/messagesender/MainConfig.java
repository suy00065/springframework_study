package com.nhnacademy.edu.springframework.messagesender;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/beans.xml")
public class MainConfig {

    @Bean
    public MessageSender smsMessageSender() {
        return new SmsMessageSender();
    }

    @Bean
    public MessageSender emailMessageSender() {
        return new EmailMessageSender();
    }
}
