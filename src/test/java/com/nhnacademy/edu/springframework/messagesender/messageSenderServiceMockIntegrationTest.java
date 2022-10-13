package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {MainConfig.class})
public class messageSenderServiceMockIntegrationTest {


    @Autowired
    @InjectMocks
    private MessageSenderService messageSenderService;

    @Mock
    private MessageSender messageSender;

    @BeforeEach
    public void init() {

    }

    @Test
    public void test() {
        messageSenderService.doMessageSend();
    }
}
