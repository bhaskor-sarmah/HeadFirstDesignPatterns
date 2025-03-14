package creational.abstract_factory_pattern;

import creational.abstract_factory_pattern.chicago_store.ChicagoPizzaIngredientFactory;
import creational.abstract_factory_pattern.chicago_store.ChicagoStylePizzaStore;
import creational.abstract_factory_pattern.newyork_store.NewYorkPizzaIngredientFactory;
import creational.abstract_factory_pattern.newyork_store.NewYorkStylePizzaStore;
import creational.factory_method_pattern.chicago_store.pizza_types.ChicagoStyleCheesePizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractFactoryPattern {
    private static final Logger logger = LoggerFactory.getLogger(AbstractFactoryPattern.class);

    public static void main(String[] args) {

        final PizzaStore newYorkPizzaStore = new NewYorkStylePizzaStore(new NewYorkPizzaIngredientFactory());

        newYorkPizzaStore.processPizza(PizzaTypes.CHEESE);
        logger.info("===========================================================");
        newYorkPizzaStore.processPizza(PizzaTypes.PEPERONI);
        logger.info("===========================================================");
        newYorkPizzaStore.processPizza(PizzaTypes.VEGGIE);
        logger.info("===========================================================");

        final PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore(new ChicagoPizzaIngredientFactory());

        chicagoPizzaStore.processPizza(PizzaTypes.CHEESE);
        logger.info("===========================================================");
        chicagoPizzaStore.processPizza(PizzaTypes.PEPERONI);
        logger.info("===========================================================");
        chicagoPizzaStore.processPizza(PizzaTypes.VEGGIE);

    }
}
