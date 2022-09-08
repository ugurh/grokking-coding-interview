package io.ugurh.sliding_window.design_pattern.oop.simpduck.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not flying");
    }
}
