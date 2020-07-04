package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.models;

import main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }
}
