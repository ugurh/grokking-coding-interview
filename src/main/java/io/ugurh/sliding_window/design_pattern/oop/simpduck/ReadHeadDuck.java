package io.ugurh.sliding_window.design_pattern.oop.simpduck;

import io.ugurh.sliding_window.design_pattern.oop.simpduck.fly.FlyWithWings;

public class ReadHeadDuck extends Duck {

    public ReadHeadDuck(){
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("I am red head duck");

    }
}
