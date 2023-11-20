package SimUduck;

public class RedheadDuck extends Duck implements Quackable, Flyable {

    @Override
    public void display() {
        // 적당한 모양을 표시
    }

    @Override
    public void fly() {
        System.out.println("훨훨~");
    }

    @Override
    public void quack() {
        System.out.println("꽉꽉!");
    }
}
