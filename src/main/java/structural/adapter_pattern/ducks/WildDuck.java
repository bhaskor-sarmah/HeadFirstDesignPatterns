package structural.adapter_pattern.ducks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildDuck implements Duck {
    private static final Logger logger = LoggerFactory.getLogger(WildDuck.class);
    public static final String WILD_DUCK = "Wild Duck";

    @Override
    public void quack() {
        logger.info("{}: Quack Quack", WILD_DUCK);
    }

    @Override
    public void fly() {
        logger.info("{}: Flying", WILD_DUCK);
    }
}