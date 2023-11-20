package SimUduck.duck;

import SimUduck.fly.FlyNoWay;
import SimUduck.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        // 적당한 모양을 표시
    }
}
