package structural.facade_pattern.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Light {

    private static final Logger logger = LoggerFactory.getLogger(Light.class);

    public void turnOn() {
        logger.info("Lights on");
    }

    public void turnOff() {
        logger.info("Lights off");
    }

    public void dimLight(final int percentage) {
        logger.info("Lights intensity set to {}%", percentage);
    }

}
