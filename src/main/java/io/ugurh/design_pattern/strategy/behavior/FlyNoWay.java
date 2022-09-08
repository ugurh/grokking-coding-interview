package io.ugurh.design_pattern.strategy.behavior;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not flying");
    }
}
