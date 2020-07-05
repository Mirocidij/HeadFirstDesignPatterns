package main.java.com.mirocidij.headfirst.patterns.chapter3.beverages;

public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
