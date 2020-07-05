package main.java.com.mirocidij.headfirst.patterns.chapter3.condiments;

import main.java.com.mirocidij.headfirst.patterns.chapter3.beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
