package SimUduck.duck;

import SimUduck.fly.FlyWithWings;
import SimUduck.quack.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        // 적당한 모양을 표시
    }
}
