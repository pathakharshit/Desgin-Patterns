package Abstract_Factory_Pattern.ingredient.dough;

public class ThickCrustDough implements Dough {
    @Override
    public String getName() {
        return "Extra Thick Crust Dough";
    }

    @Override
    public String toString() {
        return getName();
    }
}
