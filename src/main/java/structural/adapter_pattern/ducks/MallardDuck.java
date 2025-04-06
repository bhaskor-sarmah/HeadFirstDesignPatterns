package structural.adapter_pattern.ducks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck implements Duck {
    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);
    public static final String MALLARD_DUCK = "Mallard Duck";

    @Override
    public void quack() {
        logger.info("{}: Quack Quack", MALLARD_DUCK);
    }

    @Override
    public void fly() {
        logger.info("{}: Flying", MALLARD_DUCK);
    }
}
