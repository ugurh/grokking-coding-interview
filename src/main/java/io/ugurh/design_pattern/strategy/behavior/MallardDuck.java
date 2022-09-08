package io.ugurh.design_pattern.strategy.behavior;

import io.ugurh.design_pattern.strategy.behavior.Duck;
import io.ugurh.design_pattern.strategy.behavior.FlyNoWay;

public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyNoWay();
    }
    void display() {
        System.out.println("I am mallard duck");
    }
}
