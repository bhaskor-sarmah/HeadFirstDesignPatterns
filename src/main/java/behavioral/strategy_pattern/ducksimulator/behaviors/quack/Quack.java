package behavioral.strategy_pattern.ducksimulator.behaviors.quack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quack implements Quackable {

  private static final Logger logger = LoggerFactory.getLogger(Quack.class);
  public static final String QUACK_QUACK = "Quack Quack";

  @Override
  public String quack() {
    logger.info(QUACK_QUACK);
    return QUACK_QUACK;
  }
}
