package Strategy_Pattern.character;

import Strategy_Pattern.behavior.WeaponBehavior;

public abstract class Character {
    private WeaponBehavior weaponBehavior;
    public abstract void display();

    protected Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
    public void fight() {
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
