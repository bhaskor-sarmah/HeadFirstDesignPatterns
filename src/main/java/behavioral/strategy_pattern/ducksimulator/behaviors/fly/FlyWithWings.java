package behavioral.strategy_pattern.ducksimulator.behaviors.fly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyWithWings implements Flyable {
    private static final Logger logger = LoggerFactory.getLogger(FlyWithWings.class);

    private static final String FLYING_WITH_WINGS = "Flying with wings";

    @Override
    public String fly() {
        logger.info(FLYING_WITH_WINGS);
        return FLYING_WITH_WINGS;
    }
}
