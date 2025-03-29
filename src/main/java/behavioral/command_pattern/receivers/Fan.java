package behavioral.command_pattern.receivers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fan {
    private static final Logger logger = LoggerFactory.getLogger(Fan.class);

    public void turnOn() {
        logger.info("Fan turned on");
    }

    public void turnOff() {
        logger.info("Fan turned off");
    }

    public void setSpeed(final int speed) {
        logger.info("Setting speed to {}", speed);
    }
}
