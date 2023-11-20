package SimUduck.duck;

import SimUduck.fly.FlyNoWay;
import SimUduck.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        // 가짜 오리
    }
}
