package SimUduck;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void quack() {
        System.out.println("삑삑!");
    }

    @Override
    public void display() {
        // 적당한 모양을 표시
    }
}
