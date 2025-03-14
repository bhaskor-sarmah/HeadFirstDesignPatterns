package creational.abstract_factory_pattern.chicago_store.pizza_ingredients;

import creational.abstract_factory_pattern.Sauce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlumTomatoSauce implements Sauce {
    private static final Logger logger = LoggerFactory.getLogger(PlumTomatoSauce.class);

    public PlumTomatoSauce() {
        logger.info("Creating Plum Tomato Sauce");
    }

}
