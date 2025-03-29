package behavioral.command_pattern.receivers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Television {
    private static final Logger logger = LoggerFactory.getLogger(Television.class);

    public void turnOn() {
        logger.info("Television turned on");
    }

    public void turnOff() {
        logger.info("Television turned off");
    }

    public void setChannel(final int channel) {
        logger.info("Switching to channel {}", channel);
    }

    public void setVolume(final int volume) {
        logger.info("Setting volume to {}", volume);
    }
}
