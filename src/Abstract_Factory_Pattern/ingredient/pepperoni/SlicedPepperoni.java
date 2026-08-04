package Abstract_Factory_Pattern.ingredient.pepperoni;

public class SlicedPepperoni implements Pepperoni {
    @Override
    public String getName() {
        return "Sliced Pepperoni";
    }

    @Override
    public String toString() {
        return getName();
    }
}
