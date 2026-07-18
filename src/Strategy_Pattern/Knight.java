package Strategy_Pattern;

public class Knight extends Character {
    public Knight() {
        super(new SwordBehavior());
    }
    @Override
    public void display() {
        System.out.println("I am a Knight");
    }
}
