package SimUduck.duck;

import SimUduck.fly.FlyWithWings;
import SimUduck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물오리입니다.");
    }
}
