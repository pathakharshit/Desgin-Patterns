package Strategy_Pattern;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Stabbing with a knife");
    }
}
