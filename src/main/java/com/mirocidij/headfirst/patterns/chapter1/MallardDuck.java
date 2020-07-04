package main.java.com.mirocidij.headfirst.patterns.chapter1;

import main.java.com.mirocidij.headfirst.patterns.chapter1.fly.FlyWithWings;
import main.java.com.mirocidij.headfirst.patterns.chapter1.quack.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm real Mallard duck.");
    }

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
