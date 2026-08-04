package Abstract_Factory_Pattern.ingredient.clams;

public class FrozenClams implements Clams {
    @Override
    public String getName() {
        return "Frozen Clams";
    }

    @Override
    public String toString() {
        return getName();
    }
}
