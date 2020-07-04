package main.java.com.mirocidij.headfirst.patterns.chapter1;

import main.java.com.mirocidij.headfirst.patterns.chapter1.fly.FlyNoWay;
import main.java.com.mirocidij.headfirst.patterns.chapter1.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
