package Abstract_Factory_Pattern.ingredient.dough;

public class ThinCrustDough implements Dough {
    @Override
    public String getName() {
        return "Thin Crust Dough";
    }

    @Override
    public String toString() {
        return getName();
    }
}
