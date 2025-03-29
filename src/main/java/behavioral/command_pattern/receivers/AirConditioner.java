package behavioral.command_pattern.receivers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirConditioner {

    private static final Logger logger = LoggerFactory.getLogger(AirConditioner.class);

    public void turnOn() {
        logger.info("AirConditioner turned on");
    }

    public void turnOff() {
        logger.info("AirConditioner turned off");
    }

    public void setTemperature(final int temperature) {
        logger.info("Setting temperature to {}", temperature);
    }
}
