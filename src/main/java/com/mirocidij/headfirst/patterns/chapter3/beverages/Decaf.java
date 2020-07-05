package main.java.com.mirocidij.headfirst.patterns.chapter3.beverages;

public class Decaf extends Beverage {
    public Decaf() {
        description = this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 0.95;
    }
}
