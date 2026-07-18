package Strategy_Pattern.behavior_impl;

import Strategy_Pattern.behavior.WeaponBehavior;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Chopping with an axe");
    }
}
