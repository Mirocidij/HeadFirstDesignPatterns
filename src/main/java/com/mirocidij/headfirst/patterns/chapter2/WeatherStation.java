package main.java.com.mirocidij.headfirst.patterns.chapter2;

import main.java.com.mirocidij.headfirst.patterns.chapter2.views.CurrentConditionsDisplay;
import main.java.com.mirocidij.headfirst.patterns.chapter2.views.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
