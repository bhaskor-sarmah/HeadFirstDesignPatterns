package creational.abstract_factory_pattern.chicago_store.pizza_ingredients;

import creational.abstract_factory_pattern.AbstractFactoryPattern;
import creational.abstract_factory_pattern.Cheese;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MozzarellaCheese implements Cheese {
    private static final Logger logger = LoggerFactory.getLogger(MozzarellaCheese.class);

    public MozzarellaCheese() {
        logger.info("Creating Mozzarella Cheese");
    }

}
