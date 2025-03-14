package creational.abstract_factory_pattern.chicago_store;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import creational.abstract_factory_pattern.PizzaStore;
import creational.abstract_factory_pattern.PizzaTypes;
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStyleCheesePizza;
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStylePeperoniPizza;
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {

    public ChicagoStylePizzaStore(final ChicagoPizzaIngredientFactory chicagoPizzaIngredientFactory) {
        super(chicagoPizzaIngredientFactory);
    }

    @Override
    protected Pizza createPizza(PizzaTypes pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new ChicagoStyleCheesePizza();
            case PEPERONI:
                return new ChicagoStylePeperoniPizza();
            case VEGGIE:
                return new ChicagoStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type: " + pizzaType);
        }
    }
}
