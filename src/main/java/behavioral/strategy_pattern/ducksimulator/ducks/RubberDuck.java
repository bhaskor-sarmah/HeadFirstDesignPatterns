package behavioral.strategy_pattern.ducksimulator.ducks;

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyNoWay;
import behavioral.strategy_pattern.ducksimulator.behaviors.fly.Flyable;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Quackable;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.Squeak;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubberDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(RubberDuck.class);
    public static final String RUBBER_DUCK = "Rubber Duck";

    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void setFlyBehaviour(final Flyable flyBehaviour) {
        logger.warn("Fly behaviour cannot be changed");
    }

    @Override
    public String display() {
        logger.info(RUBBER_DUCK);
        return RUBBER_DUCK;
    }

}
