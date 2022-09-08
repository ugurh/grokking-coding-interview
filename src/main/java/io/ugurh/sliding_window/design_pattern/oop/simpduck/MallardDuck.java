package io.ugurh.sliding_window.design_pattern.oop.simpduck;

import io.ugurh.sliding_window.design_pattern.oop.simpduck.fly.FlyNoWay;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyNoWay();
    }
    void display() {
        System.out.println("I am mallard duck");
    }
}
