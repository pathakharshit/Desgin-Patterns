package Strategy_Pattern.character;

import Strategy_Pattern.behavior_impl.SwordBehavior;

public class King extends Character {
    public King() {
        super(new SwordBehavior());
    }
    @Override
    public void display() {
        System.out.println("I am a King");
    }
}
