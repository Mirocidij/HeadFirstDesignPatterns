package main.java.com.mirocidij.headfirst.patterns.chapter1.puzzle.weapon;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("strike with an ax");
    }
}
