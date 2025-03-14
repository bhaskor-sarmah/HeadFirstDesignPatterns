package behavioral.strategy_pattern.ducksimulator.behaviors.quack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Squeak implements Quackable {

    private static final Logger logger = LoggerFactory.getLogger(Squeak.class);
    public static final String SQUEAK_SQUEAK = "Squeak Squeak";

    @Override
    public String quack() {
        logger.info(SQUEAK_SQUEAK);
        return SQUEAK_SQUEAK;
    }
}
