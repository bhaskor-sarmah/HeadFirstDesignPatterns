package creational.abstract_factory_pattern.newyork_store.pizza_ingredients;

import creational.abstract_factory_pattern.Cheese;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReggianoCheese implements Cheese {
    private static final Logger logger = LoggerFactory.getLogger(ReggianoCheese.class);

    public ReggianoCheese() {
        logger.info("Creating Reggiano Cheese");
    }

}
