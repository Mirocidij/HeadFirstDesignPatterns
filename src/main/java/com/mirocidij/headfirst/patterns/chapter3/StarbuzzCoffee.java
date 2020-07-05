package main.java.com.mirocidij.headfirst.patterns.chapter3;

import main.java.com.mirocidij.headfirst.patterns.chapter3.beverages.Beverage;
import main.java.com.mirocidij.headfirst.patterns.chapter3.beverages.DarkRoast;
import main.java.com.mirocidij.headfirst.patterns.chapter3.beverages.Espresso;
import main.java.com.mirocidij.headfirst.patterns.chapter3.beverages.HouseBlend;
import main.java.com.mirocidij.headfirst.patterns.chapter3.condiments.Mocha;
import main.java.com.mirocidij.headfirst.patterns.chapter3.condiments.Soy;
import main.java.com.mirocidij.headfirst.patterns.chapter3.condiments.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        System.out.printf("%s $ %.2f\n", beverage1.getDescription(), beverage1.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.printf("%s $ %.2f\n", beverage2.getDescription(), beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.printf("%s $ %.2f\n", beverage3.getDescription(), beverage3.cost());
    }
}
