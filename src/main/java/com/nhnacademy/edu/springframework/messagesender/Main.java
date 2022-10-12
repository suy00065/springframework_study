package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        /*Main main = new Main();
        User user1 = new User("random@naver.com", "010-0000-0000");
        main.sendSmsMessage(user1, "테스트 메시지1");*/

        /*System.out.println("------------ 이메일 -----------");
        new MessageSenderService(new EmailMessageSender()).messageSend();
        System.out.println("---------- 문자메시지 ----------");
        new MessageSenderService(new SmsMessageSender()).messageSend();*/
    }

    void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    void sendEmailMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }
}
