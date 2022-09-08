package io.ugurh.sliding_window.design_pattern.oop.simpduck;

import io.ugurh.sliding_window.design_pattern.oop.simpduck.fly.FlyWithWings;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performFly();

        Duck redHeadDuck = new ReadHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
    }
}
