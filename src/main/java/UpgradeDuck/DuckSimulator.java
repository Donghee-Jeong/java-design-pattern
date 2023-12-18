package UpgradeDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        MallarDuck mallarDuck = new MallarDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        DuckCall duckCall = new DuckCall();
        RubberDuck rubberDuck = new RubberDuck();

        System.out.println("\n오리 시뮬레이션 게임");

        simulate(mallarDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
