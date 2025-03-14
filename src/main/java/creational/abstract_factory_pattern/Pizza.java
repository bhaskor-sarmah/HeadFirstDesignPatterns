package creational.abstract_factory_pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Pizza {
    private static final Logger logger = LoggerFactory.getLogger(Pizza.class);

    public abstract void prepare(final PizzaIngredientFactory ingredientFactory);

    private Dough dough;
    private Cheese cheese;
    private Sauce sauce;

    public void bake() {
        logger.info("Baking pizza");
    }

    public void cut() {
        logger.info("Cutting pizza");
    }

    protected void addIngredients(final PizzaIngredientFactory ingredientFactory) {
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
    }

    public void box() {
        logger.info("Packing pizza in Official Pizza box");
    }

    public Dough getDough() {
        return dough;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Sauce getSauce() {
        return sauce;
    }
}
