package io.ugurh.design_pattern.strategy.behavior;

import io.ugurh.design_pattern.strategy.behavior.Duck;
import io.ugurh.design_pattern.strategy.behavior.FlyWithWings;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck(){
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("I am red head duck");

    }
}
