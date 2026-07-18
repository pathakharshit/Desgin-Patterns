package Strategy_Pattern.behavior_impl;

import Strategy_Pattern.behavior.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Swinging a sword");
    }
}
