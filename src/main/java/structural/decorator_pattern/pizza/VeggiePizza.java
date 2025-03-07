package structural.decorator_pattern.pizza;

import java.math.BigDecimal;

public class VeggiePizza implements Pizza {

  final BigDecimal cost;

  public VeggiePizza(final String cost) {
    this.cost = new BigDecimal(cost);
  }

  @Override
  public String getDescription() {
    return "VeggiePizza loaded with bell peppers, onions, and olives";
  }

  @Override
  public BigDecimal getPrice() {
    return new BigDecimal(cost.toString());
  }
}
