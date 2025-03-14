package creational.factory_method_pattern;

import creational.factory_method_pattern.chicago_store.ChicagoStylePizzaStore;
import creational.factory_method_pattern.newyork_store.NewYorkStylePizzaStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.decorator_pattern.DecoratorPattern;

public class FactoryMethodPattern {

    private static final Logger logger = LoggerFactory.getLogger(FactoryMethodPattern.class);

    public static void main(String[] args) {

        final PizzaStore newYorkPizzaStore = new NewYorkStylePizzaStore();

        newYorkPizzaStore.processPizza(PizzaTypes.CHEESE);
        logger.info("=======================================================================");
        newYorkPizzaStore.processPizza(PizzaTypes.PEPERONI);
        logger.info("=======================================================================");
        newYorkPizzaStore.processPizza(PizzaTypes.VEGGIE);
        logger.info("=======================================================================");

        final PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        chicagoPizzaStore.processPizza(PizzaTypes.CHEESE);
        logger.info("=======================================================================");
        chicagoPizzaStore.processPizza(PizzaTypes.PEPERONI);
        logger.info("=======================================================================");
        chicagoPizzaStore.processPizza(PizzaTypes.VEGGIE);

    }
}
