package Strategy_Pattern;

public class Queen extends Character {
    public Queen() {
        super(new BowAndArrowBehavior());
    }
    @Override
    public void display() {
        System.out.println("I am a Queen");
    }
}
