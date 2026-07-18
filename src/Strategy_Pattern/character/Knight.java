package Strategy_Pattern.character;

import Strategy_Pattern.behavior_impl.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        super(new SwordBehavior());
    }
    @Override
    public void display() {
        System.out.println("I am a Knight");
    }
}
