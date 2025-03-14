package creational.factory_method_pattern.chicago_store.pizza_types;

import creational.factory_method_pattern.Pizza;
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStyleVeggiePizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(ChicagoStyleVeggiePizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing Chicago Style Veggie Pizza");
    }

    @Override
    public void box() {
        logger.info("Packing pizza in Chicago Style Pizza box");
    }

}
