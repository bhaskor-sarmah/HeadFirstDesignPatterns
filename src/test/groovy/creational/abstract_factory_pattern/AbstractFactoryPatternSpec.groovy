package creational.abstract_factory_pattern

import creational.abstract_factory_pattern.chicago_store.ChicagoPizzaIngredientFactory
import creational.abstract_factory_pattern.chicago_store.ChicagoStylePizzaStore
import creational.abstract_factory_pattern.chicago_store.pizza_ingredients.MozzarellaCheese
import creational.abstract_factory_pattern.chicago_store.pizza_ingredients.PlumTomatoSauce
import creational.abstract_factory_pattern.chicago_store.pizza_ingredients.ThickCrustDough
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStyleCheesePizza
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStylePeperoniPizza
import creational.abstract_factory_pattern.chicago_store.pizza_types.ChicagoStyleVeggiePizza
import creational.abstract_factory_pattern.newyork_store.NewYorkPizzaIngredientFactory
import creational.abstract_factory_pattern.newyork_store.NewYorkStylePizzaStore
import creational.abstract_factory_pattern.newyork_store.pizza_ingredients.MarinaraSauce
import creational.abstract_factory_pattern.newyork_store.pizza_ingredients.ReggianoCheese
import creational.abstract_factory_pattern.newyork_store.pizza_ingredients.ThinCrustDough
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStylePeperoniPizza
import creational.abstract_factory_pattern.newyork_store.pizza_types.NewYorkStyleVeggiePizza
import spock.lang.Specification
import spock.lang.Unroll

class AbstractFactoryPatternSpec extends Specification {

    def "NewYorkStylePizzaStore should create correct pizza type"() {
        given: "A New York Pizza Store"
        def nyPizzaStore = new NewYorkStylePizzaStore(new NewYorkPizzaIngredientFactory())

        when: "We order a pizza of type #pizzaType"
        def pizza = nyPizzaStore.processPizza(pizzaType)

        then: "The correct pizza subclass should be created"
        pizza.class == expectedClass

        where:
        pizzaType           | expectedClass
        PizzaTypes.CHEESE   | NewYorkStyleCheesePizza
        PizzaTypes.PEPERONI | NewYorkStylePeperoniPizza
        PizzaTypes.VEGGIE   | NewYorkStyleVeggiePizza
    }

    def "ChicagoStylePizzaStore should create correct pizza type"() {
        given: "A Chicago Pizza Store"
        def chicagoPizzaStore = new ChicagoStylePizzaStore(new ChicagoPizzaIngredientFactory())

        when: "We order a pizza of type #pizzaType"
        def pizza = chicagoPizzaStore.processPizza(pizzaType)

        then: "The correct pizza subclass should be created"
        pizza.class == expectedClass

        where:
        pizzaType           | expectedClass
        PizzaTypes.CHEESE   | ChicagoStyleCheesePizza
        PizzaTypes.PEPERONI | ChicagoStylePeperoniPizza
        PizzaTypes.VEGGIE   | ChicagoStyleVeggiePizza
    }

    @Unroll
    def "New York Cheese Pizza should have ThickCrustDough"() {
        given: "A New York Pizza Store"
        def nyPizzaStore = new NewYorkStylePizzaStore(new NewYorkPizzaIngredientFactory())

        when: "We order a New York Cheese Pizza"
        def pizza = nyPizzaStore.processPizza(PizzaTypes.CHEESE)

        then: "It should use ThickCrustDough"
        pizza.getDough() instanceof ThickCrustDough
        pizza.getCheese() instanceof ReggianoCheese
        pizza.getSauce() instanceof MarinaraSauce
    }

    @Unroll
    def "Chicago Cheese Pizza should have ThinCrustDough"() {
        given: "A Chicago Pizza Store"
        def chicagoPizzaStore = new ChicagoStylePizzaStore(new ChicagoPizzaIngredientFactory())

        when: "We order a Chicago Cheese Pizza"
        def pizza = chicagoPizzaStore.processPizza(PizzaTypes.CHEESE)

        then: "It should use ThinCrustDough"
        pizza.getDough() instanceof ThinCrustDough
        pizza.getCheese() instanceof MozzarellaCheese
        pizza.getSauce() instanceof PlumTomatoSauce
    }

}
