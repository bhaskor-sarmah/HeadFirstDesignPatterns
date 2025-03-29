package behavioral.command_pattern.receivers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stereo {
    private static final Logger logger = LoggerFactory.getLogger(Stereo.class);

    public void turnOn() {
        logger.info("Stereo turned on");
    }

    public void turnOff() {
        logger.info("Stereo turned off");
    }

    public void setCD() {
        logger.info("Inserting CD...");
    }

    public void setVolume(final int volume) {
        logger.info("Setting volume to {}", volume);
    }
}
