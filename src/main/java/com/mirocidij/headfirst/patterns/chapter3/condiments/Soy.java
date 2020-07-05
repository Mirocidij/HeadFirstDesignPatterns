package main.java.com.mirocidij.headfirst.patterns.chapter3.condiments;

import main.java.com.mirocidij.headfirst.patterns.chapter3.beverages.Beverage;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {this.beverage = beverage;}

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + this.getClass().getSimpleName();
    }
}
