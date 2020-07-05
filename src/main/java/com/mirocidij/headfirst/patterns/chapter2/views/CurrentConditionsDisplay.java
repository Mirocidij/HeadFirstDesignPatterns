package main.java.com.mirocidij.headfirst.patterns.chapter2.views;

import main.java.com.mirocidij.headfirst.patterns.chapter2.observers.Observer;
import main.java.com.mirocidij.headfirst.patterns.chapter2.subjects.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(
            "Current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
