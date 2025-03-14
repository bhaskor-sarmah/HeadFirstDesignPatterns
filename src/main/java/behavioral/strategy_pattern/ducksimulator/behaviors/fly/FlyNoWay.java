package behavioral.strategy_pattern.ducksimulator.behaviors.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyNoWay implements Flyable {

  private static final Logger logger = LoggerFactory.getLogger(FlyNoWay.class);

  private static final String NO_FLY = "No Fly";

  @Override
  public String fly() {
    logger.info(NO_FLY);
    return NO_FLY;
  }
}
