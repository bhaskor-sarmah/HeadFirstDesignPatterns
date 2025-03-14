package structural.decorator_pattern;

import behavioral.strategy_pattern.StrategyPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import structural.decorator_pattern.pizza.MargheritaPizza;
import structural.decorator_pattern.pizza.PepperoniPizza;
import structural.decorator_pattern.pizza.Pizza;
import structural.decorator_pattern.pizza.VeggiePizza;
import structural.decorator_pattern.pizza_decorator.ExtraCheese;
import structural.decorator_pattern.pizza_decorator.ExtraMushrooms;
import structural.decorator_pattern.pizza_decorator.ExtraOlives;

public class DecoratorPattern {

  private static final Logger logger = LoggerFactory.getLogger(DecoratorPattern.class);

  public static void main(String[] args) {

    final Pizza margheritaPizza = new MargheritaPizza(MenuPrice.MARGHERITA_PIZZA_PRICE);
    final Pizza pepperoniPizza = new PepperoniPizza(MenuPrice.PEPPERONI_PIZZA_PRICE);
    final Pizza veggiePizza = new VeggiePizza(MenuPrice.VEGGIE_PIZZA_PRICE);

    printPizzaDetails(margheritaPizza);
    printPizzaDetails(pepperoniPizza);
    printPizzaDetails(veggiePizza);

    final Pizza veggieWithMushrooms = new ExtraMushrooms(veggiePizza, MenuPrice.EXTRA_MUSHROOMS_TOPPING_PRICE);

    printPizzaDetails(veggieWithMushrooms);

    final Pizza doubleCheeseMargherita = new ExtraCheese(
        new ExtraCheese(margheritaPizza, MenuPrice.EXTRA_CHEESE_TOPPING_PRICE),
        MenuPrice.EXTRA_CHEESE_TOPPING_PRICE);

    printPizzaDetails(doubleCheeseMargherita);

    final Pizza cheeseOlivesMushroomsPeperoni = new ExtraCheese(
        new ExtraOlives(new ExtraMushrooms(pepperoniPizza, MenuPrice.EXTRA_MUSHROOMS_TOPPING_PRICE),
            MenuPrice.EXTRA_OLIVES_TOPPING_PRICE), MenuPrice.EXTRA_CHEESE_TOPPING_PRICE);

    printPizzaDetails(cheeseOlivesMushroomsPeperoni);
  }

  private static void printPizzaDetails(Pizza pizza) {
      logger.info("{} : ${}", pizza.getDescription(), pizza.getPrice());
  }
}
