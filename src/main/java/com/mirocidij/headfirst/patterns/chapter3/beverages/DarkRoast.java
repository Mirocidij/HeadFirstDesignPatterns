package main.java.com.mirocidij.headfirst.patterns.chapter3.beverages;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 1.25;
    }
}
