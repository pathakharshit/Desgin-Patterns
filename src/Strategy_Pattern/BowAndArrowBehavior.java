package Strategy_Pattern;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Shooting with a bow and arrow");
    }
}
