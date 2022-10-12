package study;

public class Main {
    public static void main(String[] args) {
        new GreetingService(new EnglishGreeter()).greet();
        new GreetingService(new KoreanGreeter()).greet();
    }

    static void sayHelloInKorean(String name) {

    }

    static void sayHelloInEnglish(String name) {

    }

}
