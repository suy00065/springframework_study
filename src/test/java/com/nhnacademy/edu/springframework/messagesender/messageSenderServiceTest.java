package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.config.MainConfig;
import com.nhnacademy.edu.springframework.messagesender.config.ServiceConfig;
//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class messageSenderServiceTest {
    //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class, ServiceConfig.class);
    //MessageSenderService messageSenderService = MessageSenderService.class.cast(context.getBean("messageSenderService"));

    MessageSenderService messageSenderService = new MessageSenderService();

    /*@Test
    void testMessageSenderService() {
        ReflectionTestUtils.setField(messageSenderService, "messageSender", new SmsMessageSender());
        boolean actual = messageSenderService.doMessageSend();
        Assertions.assertThat(actual).isTrue();
    }*/

    /*@Test
    void testSmsMessageSender() {
        MessageSender mockSender = mock(MessageSender.class);
        messageSenderService = new MessageSenderService();
        messageSenderService.setMessageSender(mockSender);

        User user = new User("jsjlfk@naver.com", "010-1111-1111");
        when(mockSender.sendMessage(user, "test1234")).thenReturn(false);

        boolean actual = messageSenderService.doMessageSend();
        Assertions.assertThat(actual).isEqualTo(false);
    }*/
}
