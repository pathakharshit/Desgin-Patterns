package Strategy_Pattern.behavior_impl;

import Strategy_Pattern.behavior.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shooting with a bow and arrow");
    }
}
