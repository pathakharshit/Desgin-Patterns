package Strategy_Pattern.behavior_impl;

import Strategy_Pattern.behavior.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Stabbing with a knife");
    }
}
