package behavioral.strategy_pattern.ducksimulator.behaviors.fly;

import behavioral.strategy_pattern.ducksimulator.ducks.RubberDuck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyWithPropultion implements Flyable {

  private static final Logger logger = LoggerFactory.getLogger(FlyWithPropultion.class);

  private static final String FLYING_WITH_ROCKET_PROPULTION = "Flying with Rocket Propultion";

  @Override
  public String fly() {
    logger.info(FLYING_WITH_ROCKET_PROPULTION);
    return FLYING_WITH_ROCKET_PROPULTION;
  }
}
