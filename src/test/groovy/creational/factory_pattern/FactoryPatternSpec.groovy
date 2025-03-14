package creational.factory_pattern

import creational.factory_method_pattern.chicago_store.pizza_types.ChicagoStyleVeggiePizza
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStylePeperoniPizza
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStyleVeggiePizza
import creational.factory_method_pattern.PizzaTypes
import creational.factory_method_pattern.chicago_store.ChicagoStylePizzaStore
import creational.factory_method_pattern.chicago_store.pizza_types.ChicagoStyleCheesePizza
import creational.factory_method_pattern.chicago_store.pizza_types.ChicagoStylePeperoniPizza
import creational.factory_method_pattern.newyork_store.NewYorkStylePizzaStore
import creational.factory_method_pattern.newyork_store.pizza_types.NewYorkStyleCheesePizza
import spock.lang.Specification

class FactoryPatternSpec extends Specification {

    def "NewYorkStylePizzaStore should create correct pizza instance"() {
        given:
        def nyPizzaStore = new NewYorkStylePizzaStore()

        expect:
        nyPizzaStore.createPizza(pizzaType).class == expectedClass

        where:
        pizzaType           | expectedClass
        PizzaTypes.CHEESE   | NewYorkStyleCheesePizza
        PizzaTypes.PEPERONI | NewYorkStylePeperoniPizza
        PizzaTypes.VEGGIE   | NewYorkStyleVeggiePizza
    }

    def "ChicagoStylePizzaStore should create correct pizza instance"() {
        given:
        def chicagoPizzaStore = new ChicagoStylePizzaStore()

        expect:
        chicagoPizzaStore.createPizza(pizzaType).class == expectedClass

        where:
        pizzaType           | expectedClass
        PizzaTypes.CHEESE   | ChicagoStyleCheesePizza
        PizzaTypes.PEPERONI | ChicagoStylePeperoniPizza
        PizzaTypes.VEGGIE   | ChicagoStyleVeggiePizza
    }
}
