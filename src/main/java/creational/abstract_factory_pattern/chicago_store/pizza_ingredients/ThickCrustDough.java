package creational.abstract_factory_pattern.chicago_store.pizza_ingredients;

import creational.abstract_factory_pattern.Dough;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThickCrustDough implements Dough {
    private static final Logger logger = LoggerFactory.getLogger(ThickCrustDough.class);

    public ThickCrustDough() {
        logger.info("Creating a Thick Crust Dough");
    }

}
