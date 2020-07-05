package main.java.com.mirocidij.headfirst.patterns.chapter3.condiments;

import main.java.com.mirocidij.headfirst.patterns.chapter3.beverages.Beverage;

public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {this.beverage = beverage;}

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.getClass().getSimpleName();
    }

}
