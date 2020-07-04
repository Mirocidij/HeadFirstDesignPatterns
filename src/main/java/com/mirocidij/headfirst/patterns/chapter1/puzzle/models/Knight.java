package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.models;

import main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon.KnifeBehavior;

public class Knight extends Character {
    public Knight() {
        weapon = new KnifeBehavior();
    }
}
