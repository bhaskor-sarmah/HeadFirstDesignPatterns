package behavioral.strategy_pattern.ducksimulator.ducks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck extends Duck {
  private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);
  public static final String MALLARD_DUCK = "Mallard Duck";

  @Override
  public String display() {
    logger.info(MALLARD_DUCK);
    return MALLARD_DUCK;
  }

}
