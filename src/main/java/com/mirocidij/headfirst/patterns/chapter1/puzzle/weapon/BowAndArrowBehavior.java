package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shot from a bow");
    }
}
