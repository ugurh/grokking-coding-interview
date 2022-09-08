package io.ugurh.design_pattern.strategy.behavior;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
