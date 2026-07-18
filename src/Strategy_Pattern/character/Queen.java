package Strategy_Pattern.character;

import Strategy_Pattern.behavior_impl.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        super(new BowAndArrowBehavior());
    }
    @Override
    public void display() {
        System.out.println("I am a Queen");
    }
}
