package io.ugurh.sliding_window.design_pattern.oop.simpduck;

import io.ugurh.sliding_window.design_pattern.oop.simpduck.fly.FlyBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;

    abstract void display();

    void performFly(){
        flyBehavior.fly();
    }

    void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
}
