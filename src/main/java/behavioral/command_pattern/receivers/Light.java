package behavioral.command_pattern.receivers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Light {

    private static final Logger logger = LoggerFactory.getLogger(Light.class);

    public void turnOn() {
        logger.info("Light turned on");
    }

    public void turnOff() {
        logger.info("Light turned off");
    }
}
