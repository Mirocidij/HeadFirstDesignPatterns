package main.java.com.mirocidij.headfirst.patterns.chapter1.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
