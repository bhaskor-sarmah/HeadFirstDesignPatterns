package creational.factory_method_pattern.chicago_store.pizza_types;

import creational.factory_method_pattern.Pizza;
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStylePeperoniPizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(ChicagoStylePeperoniPizza.class);

    @Override
    public void prepare() {
        logger.info("Preparing Chicago Style Peperoni Pizza");
    }

    @Override
    public void box() {
        logger.info("Packing pizza in Chicago Style Pizza box");
    }

}
