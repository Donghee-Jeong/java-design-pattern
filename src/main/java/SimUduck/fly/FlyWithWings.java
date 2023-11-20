package SimUduck.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("(날개를 가지고) 펄럭펄럭");
    }
}
