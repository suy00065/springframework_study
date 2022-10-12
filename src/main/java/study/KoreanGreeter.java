package study;

public class KoreanGreeter implements Greeter{
    @Override
    public boolean sayHello() {
        System.out.println("안녕 세상");
        return true;
    }
}
