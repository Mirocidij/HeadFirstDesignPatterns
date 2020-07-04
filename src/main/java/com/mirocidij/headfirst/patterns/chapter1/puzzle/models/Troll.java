package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.models;

import main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weapon = new AxeBehavior();
    }
}
