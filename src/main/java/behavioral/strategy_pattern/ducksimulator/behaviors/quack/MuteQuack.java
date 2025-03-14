package behavioral.strategy_pattern.ducksimulator.behaviors.quack;

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyWithWings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuteQuack implements Quackable {

  private static final Logger logger = LoggerFactory.getLogger(MuteQuack.class);

  public static final String NO_SOUND = "No Sound";

  @Override
  public String quack() {
    logger.info(NO_SOUND);
    return NO_SOUND;
  }
}
