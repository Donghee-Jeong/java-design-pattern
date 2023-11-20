package SimUduck;

import SimUduck.duck.Duck;
import SimUduck.duck.MallardDuck;

public class MiniDuckSimulation {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
