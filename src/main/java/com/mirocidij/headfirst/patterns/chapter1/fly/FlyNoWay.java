package main.java.com.mirocidij.headfirst.patterns.chapter1.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
