package Strategy_Pattern.character;

import Strategy_Pattern.behavior_impl.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        super(new AxeBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am a Troll");
    }
}
