package creational.abstract_factory_pattern.newyork_store.pizza_types;

import creational.abstract_factory_pattern.AbstractFactoryPattern;
import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewYorkStyleVeggiePizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(NewYorkStyleVeggiePizza.class);

    @Override
    public void prepare(final PizzaIngredientFactory ingredientFactory) {
        logger.info("Preparing NewYork Style Veggie Pizza");
        addIngredients(ingredientFactory);
    }

}
