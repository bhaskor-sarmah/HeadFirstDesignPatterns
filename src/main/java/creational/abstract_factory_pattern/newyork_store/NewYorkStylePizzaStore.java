package creational.abstract_factory_pattern.newyork_store;

import creational.abstract_factory_pattern.Pizza;
import creational.abstract_factory_pattern.PizzaIngredientFactory;
import creational.abstract_factory_pattern.PizzaStore;
import creational.abstract_factory_pattern.PizzaTypes;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStylePeperoniPizza;
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleVeggiePizza;

public class NewYorkStylePizzaStore extends PizzaStore {

    public NewYorkStylePizzaStore(final NewYorkPizzaIngredientFactory newYorkPizzaIngredientFactory) {
        super(newYorkPizzaIngredientFactory);
    }

    @Override
    protected Pizza createPizza(PizzaTypes pizzaType) {
        switch (pizzaType) {
            case CHEESE:
                return new NewYorkStyleCheesePizza();
            case PEPERONI:
                return new NewYorkStylePeperoniPizza();
            case VEGGIE:
                return new NewYorkStyleVeggiePizza();
            default:
                throw new IllegalArgumentException("Invalid pizza type: " + pizzaType);
        }
    }
}
