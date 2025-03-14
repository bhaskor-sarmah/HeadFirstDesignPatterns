package behavioral.strategy_pattern.ducksimulator.ducks;

import behavioral.strategy_pattern.ducksimulator.behaviors.fly.FlyWithPropultion;
import behavioral.strategy_pattern.ducksimulator.behaviors.quack.MuteQuack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelDuck extends Duck {
    private static final Logger logger = LoggerFactory.getLogger(ModelDuck.class);
    public static final String MODEL_DUCK = "Model Duck";

    public ModelDuck() {
        flyBehaviour = new FlyWithPropultion();
        quackBehaviour = new MuteQuack();
    }

    @Override
    public String display() {
        logger.info(MODEL_DUCK);
        return MODEL_DUCK;
    }
}
