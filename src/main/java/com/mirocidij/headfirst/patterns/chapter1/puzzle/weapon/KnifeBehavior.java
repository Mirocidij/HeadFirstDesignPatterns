package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("strike with a knife");
    }
}
