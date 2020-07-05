package main.java.com.mirocidij.headfirst.patterns.chapter2.views;

import main.java.com.mirocidij.headfirst.patterns.chapter2.observers.Observer;
import main.java.com.mirocidij.headfirst.patterns.chapter2.subjects.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Statistics display: " + temperature + " " + humidity + " " + pressure);
    }
}
