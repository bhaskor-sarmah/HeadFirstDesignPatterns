package creational.factory_method_pattern.newyork_store.pizza_types;

import creational.factory_method_pattern.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewYorkStylePeperoniPizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(NewYorkStylePeperoniPizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing NewYork Style Peperoni Pizza");
    }

    @Override
    public void box() {
        logger.info("Packing pizza in NewYork Style Pizza box");
    }

}
