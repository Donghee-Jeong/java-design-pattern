package SimUduck;

public class RubberDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("삑삑!");
    }

    @Override
    public void display() {
        // 적당한 모양을 표시
    }

    @Override
    public void fly() {
        // 아무것도 하지 않게 오버라이드
    }
}
