package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.MessageSenderService;
import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.nhnacademy.edu.springframework.messagesender"})
public class ServiceConfig {
    @Autowired
    private MainConfig mainConfig;

    @Bean("messageSenderService")
    public MessageSenderService messageSenderService() {
        return new MessageSenderService(mainConfig.smsMessageSender());
    }
}
