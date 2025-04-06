package structural.facade_pattern.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Screen {

    private static final Logger logger = LoggerFactory.getLogger(Screen.class);

    public void lowerScreen() {
        logger.info("Screen is lowering...");
    }

    public void pullUpScreen() {
        logger.info("Screen is rolling up...");
    }
}
