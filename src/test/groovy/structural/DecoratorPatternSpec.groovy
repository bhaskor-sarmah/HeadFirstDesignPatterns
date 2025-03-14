package structural

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll
import structural.decorator_pattern.MenuPrice
import structural.decorator_pattern.pizza.MargheritaPizza
import structural.decorator_pattern.pizza.PepperoniPizza
import structural.decorator_pattern.pizza.Pizza
import structural.decorator_pattern.pizza.VeggiePizza
import structural.decorator_pattern.pizza_decorator.ExtraCheese
import structural.decorator_pattern.pizza_decorator.ExtraMushrooms
import structural.decorator_pattern.pizza_decorator.ExtraOlives

class DecoratorPatternSpec extends Specification {

    // Setting up all the pizzaTypes
    private static final String VEGGIE_PIZZA = "VeggiePizza"
    private static final String PEPPERONI_PIZZA = "PepperoniPizza"
    private static final String MARGHERITA_PIZZA = "MargheritaPizza"
    private static final String DOUBLE_CHEESE_MARGHERITA_PIZZA = "Double Cheese"
    private static final String VEGGIE_MUSHROOM_PIZZA = "Veggie + Mushrooms"
    private static final String CHEESE_OLIVES_MUSHROOM_PEPPERONI_PIZZA = "Cheese + Olives + Mushrooms + Pepperoni"

    // Setting up all the pizzaDescriptions
    private static final String VEGGIE_PIZZA_DESC = "VeggiePizza loaded with bell peppers, onions, and olives"
    private static final String PEPPERONI_PIZZA_DESC = "PepperoniPizza with tomato sauce, cheese, and pepperoni slices"
    private static final String MARGHERITA_PIZZA_DESC = "MargheritaPizza with tomato sauce and cheese"
    private static final String VEGGIE_MUSHROOM_DESC = VEGGIE_PIZZA_DESC + " + extra Mushrooms"
    private static final String DOUBLE_CHEESE_MARGHERITA_DESC = MARGHERITA_PIZZA_DESC + " + extra cheese + extra cheese"
    private static final String CHEESE_OLIVES_MUSHROOM_PEPPERONI_DESC = PEPPERONI_PIZZA_DESC + " + extra Mushrooms + extra Olives + extra cheese"

    // Setting up all the pizza prices
    private static final BigDecimal VEGGIE_MUSHROOM_PRICE = new BigDecimal(MenuPrice.VEGGIE_PIZZA_PRICE) + new BigDecimal(MenuPrice.EXTRA_MUSHROOMS_TOPPING_PRICE)
    private static final BigDecimal DOUBLE_CHEESE_MARGHERITA_PRICE = new BigDecimal(MenuPrice.MARGHERITA_PIZZA_PRICE) + 2 * new BigDecimal(MenuPrice.EXTRA_CHEESE_TOPPING_PRICE)
    private static final BigDecimal CHEESE_OLIVES_MUSHROOM_PEPPERONI_PRICE = new BigDecimal(MenuPrice.PEPPERONI_PIZZA_PRICE) + new BigDecimal(MenuPrice.EXTRA_MUSHROOMS_TOPPING_PRICE) + new BigDecimal(MenuPrice.EXTRA_OLIVES_TOPPING_PRICE) + new BigDecimal(MenuPrice.EXTRA_CHEESE_TOPPING_PRICE)

    @Shared
    private static Pizza margheritaPizza = new MargheritaPizza(MenuPrice.MARGHERITA_PIZZA_PRICE)
    @Shared
    private static Pizza pepperoniPizza = new PepperoniPizza(MenuPrice.PEPPERONI_PIZZA_PRICE)
    @Shared
    private static Pizza veggiePizza = new VeggiePizza(MenuPrice.VEGGIE_PIZZA_PRICE)
    @Shared
    private static Pizza veggieWithMushrooms = new ExtraMushrooms(veggiePizza, MenuPrice.EXTRA_MUSHROOMS_TOPPING_PRICE)
    @Shared
    private static Pizza doubleCheeseMargherita = new ExtraCheese(
            new ExtraCheese(margheritaPizza, MenuPrice.EXTRA_CHEESE_TOPPING_PRICE),
            MenuPrice.EXTRA_CHEESE_TOPPING_PRICE
    )
    @Shared
    private static Pizza cheeseOlivesMushroomsPepperoni = new ExtraCheese(
            new ExtraOlives(new ExtraMushrooms(pepperoniPizza, MenuPrice.EXTRA_MUSHROOMS_TOPPING_PRICE),
                    MenuPrice.EXTRA_OLIVES_TOPPING_PRICE),
            MenuPrice.EXTRA_CHEESE_TOPPING_PRICE
    )

    @Unroll
    def "Pizza of type #pizzaType should have correct description and price"() {
        expect:
        pizza.getDescription() == expectedDescription
        pizza.getPrice() == expectedPrice

        where:
        pizzaType                              | pizza                          | expectedDescription                   | expectedPrice
        MARGHERITA_PIZZA                       | margheritaPizza                | MARGHERITA_PIZZA_DESC                 | new BigDecimal(MenuPrice.MARGHERITA_PIZZA_PRICE)
        PEPPERONI_PIZZA                        | pepperoniPizza                 | PEPPERONI_PIZZA_DESC                  | new BigDecimal(MenuPrice.PEPPERONI_PIZZA_PRICE)
        VEGGIE_PIZZA                           | veggiePizza                    | VEGGIE_PIZZA_DESC                     | new BigDecimal(MenuPrice.VEGGIE_PIZZA_PRICE)
        VEGGIE_MUSHROOM_PIZZA                  | veggieWithMushrooms            | VEGGIE_MUSHROOM_DESC                  | VEGGIE_MUSHROOM_PRICE
        DOUBLE_CHEESE_MARGHERITA_PIZZA         | doubleCheeseMargherita         | DOUBLE_CHEESE_MARGHERITA_DESC         | DOUBLE_CHEESE_MARGHERITA_PRICE
        CHEESE_OLIVES_MUSHROOM_PEPPERONI_PIZZA | cheeseOlivesMushroomsPepperoni | CHEESE_OLIVES_MUSHROOM_PEPPERONI_DESC | CHEESE_OLIVES_MUSHROOM_PEPPERONI_PRICE
    }
}
