package Abstract_Factory_Pattern.ingredient.cheese;

public class ReggianoCheese implements Cheese {
    @Override
    public String getName() {
        return "Reggiano Cheese";
    }

    @Override
    public String toString() {
        return getName();
    }
}
