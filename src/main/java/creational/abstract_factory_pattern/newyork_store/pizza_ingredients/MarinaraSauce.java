package creational.abstract_factory_pattern.newyork_store.pizza_ingredients;

import creational.abstract_factory_pattern.Sauce;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarinaraSauce implements Sauce {
    private static final Logger logger = LoggerFactory.getLogger(MarinaraSauce.class);

    public MarinaraSauce() {
        logger.info("Creating Marinara Sauce");
    }

}
