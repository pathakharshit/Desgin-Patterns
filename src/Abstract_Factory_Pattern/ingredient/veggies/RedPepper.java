package Abstract_Factory_Pattern.ingredient.veggies;

public class RedPepper implements Veggies {
    @Override
    public String getName() {
        return "Red Pepper";
    }

    @Override
    public String toString() {
        return getName();
    }
}
