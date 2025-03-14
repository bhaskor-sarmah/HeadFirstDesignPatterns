package creational.factory_method_pattern.newyork_store.pizza_types;

import creational.factory_method_pattern.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewYorkStyleVeggiePizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(NewYorkStyleVeggiePizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing NewYork Style Veggie Pizza");
    }

    @Override
    public void box() {
        logger.info("Packing pizza in NewYork Style Pizza box");
    }

}
