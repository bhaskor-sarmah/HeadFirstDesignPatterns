package creational.abstract_factory_pattern.newyork_store.pizza_types;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewYorkStyleCheesePizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(NewYorkStyleCheesePizza.class);

    @Override
    public void prepare(final PizzaIngredientFactory ingredientFactory) {
        logger.info("Preparing NewYork Style Cheese Pizza");
        addIngredients(ingredientFactory);
    }

}
