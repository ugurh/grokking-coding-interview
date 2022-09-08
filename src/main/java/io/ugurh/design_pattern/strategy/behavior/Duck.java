package io.ugurh.design_pattern.strategy.behavior;

import io.ugurh.design_pattern.strategy.behavior.FlyBehavior;

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
