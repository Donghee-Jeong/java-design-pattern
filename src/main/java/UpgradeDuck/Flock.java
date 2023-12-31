package UpgradeDuck;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {

    List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        quackers.forEach(Quackable::quack);
    }
}
