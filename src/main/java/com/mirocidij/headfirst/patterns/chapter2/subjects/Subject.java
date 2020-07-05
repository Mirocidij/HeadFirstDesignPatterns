package main.java.com.mirocidij.headfirst.patterns.chapter2.subjects;

import main.java.com.mirocidij.headfirst.patterns.chapter2.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
