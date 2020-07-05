package main.java.com.mirocidij.headfirst.patterns.chapter2.java.util;

import main.java.com.mirocidij.headfirst.patterns.chapter2.views.CurrentConditionsDisplay;
import main.java.com.mirocidij.headfirst.patterns.chapter2.views.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity);
    }
}
