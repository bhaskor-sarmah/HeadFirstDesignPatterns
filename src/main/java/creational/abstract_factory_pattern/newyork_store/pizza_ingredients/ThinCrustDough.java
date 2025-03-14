package creational.abstract_factory_pattern.newyork_store.pizza_ingredients;

import creational.abstract_factory_pattern.Dough;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThinCrustDough implements Dough {
    private static final Logger logger = LoggerFactory.getLogger(ThinCrustDough.class);

    public ThinCrustDough() {
        logger.info("Creating a Thin Crust Dough");
    }

}
