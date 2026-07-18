package Strategy_Pattern.client;

import Strategy_Pattern.behavior_impl.BowAndArrowBehavior;
import Strategy_Pattern.character.Character;
import Strategy_Pattern.character.King;

public class GameSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.display();
        king.fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();
    }
}
