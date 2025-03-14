package creational.abstract_factory_pattern;

public abstract class PizzaStore {

    private final PizzaIngredientFactory ingredientFactory;

    protected PizzaStore(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public Pizza processPizza(PizzaTypes pizzaType) {
        final Pizza pizza = createPizza(pizzaType);
        pizza.prepare(ingredientFactory);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaTypes pizzaType);

    public PizzaIngredientFactory getIngredientFactory() {
        return ingredientFactory;
    }
}
