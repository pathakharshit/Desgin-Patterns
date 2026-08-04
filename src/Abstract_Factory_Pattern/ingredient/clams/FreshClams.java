package Abstract_Factory_Pattern.ingredient.clams;

public class FreshClams implements Clams {
    @Override
    public String getName() {
        return "Fresh Clams";
    }

    @Override
    public String toString() {
        return getName();
    }
}
