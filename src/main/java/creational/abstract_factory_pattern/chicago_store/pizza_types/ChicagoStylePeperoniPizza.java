package creational.abstract_factory_pattern.chicago_store.pizza_types;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import creational.abstract_factory_pattern.chicago_store.pizza_ingredients.MozzarellaCheese;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStylePeperoniPizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(ChicagoStylePeperoniPizza.class);

    @Override
    public void prepare(final PizzaIngredientFactory ingredientFactory) {
        logger.info("Preparing Chicago Style Peperoni Pizza");
        addIngredients(ingredientFactory);
    }

}
