package main.java.com.mirocidij.headfirst.patterns.chapter3.beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = this.getClass().getSimpleName();
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
