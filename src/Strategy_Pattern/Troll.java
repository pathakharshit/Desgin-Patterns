package Strategy_Pattern;

public class Troll extends Character {
    public Troll() {
        super(new AxeBehavior());
    }

    @Override
    public void display() {
        System.out.println("I am a Troll");
    }
}
