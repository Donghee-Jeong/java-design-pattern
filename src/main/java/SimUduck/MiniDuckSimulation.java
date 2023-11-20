package SimUduck;

import SimUduck.duck.Duck;
import SimUduck.duck.MallardDuck;
import SimUduck.duck.ModelDuck;
import SimUduck.fly.FlyRocketPowered;

public class MiniDuckSimulation {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
