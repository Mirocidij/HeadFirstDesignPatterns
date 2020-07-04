package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.models;

import main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
