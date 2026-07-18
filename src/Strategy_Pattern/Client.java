package Strategy_Pattern;

public class Client {
    public static void main(String[] args) {
        Character king = new King();
        king.display();
        king.fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();
    }
}
