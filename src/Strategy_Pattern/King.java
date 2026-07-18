package Strategy_Pattern;

public class King extends Character {
    public King() {
        super(new SwordBehavior());
    }
    @Override
    public void display() {
        System.out.println("I am a King");
    }
}
