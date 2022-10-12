package study;

public class GreetingService {
    private final Greeter greeter;

    public GreetingService(Greeter greeter) {
        this.greeter = greeter;
    }

    public boolean greet() {
        // 인터페이스의 메소드를 호출하지만 실제 구현 객체의 메소드가 실행된다.
        return greeter.sayHello();
    }
}
