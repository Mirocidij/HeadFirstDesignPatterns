package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.models;

import main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon.SwordBehavior;

public class King extends Character {
    public King() {
        weapon = new SwordBehavior();
    }
}
