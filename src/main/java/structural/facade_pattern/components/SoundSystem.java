package structural.facade_pattern.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoundSystem {

    private static final Logger logger = LoggerFactory.getLogger(SoundSystem.class);

    public void turnOn() {
        logger.info("SoundSystem on");
    }

    public void turnOff() {
        logger.info("SoundSystem off");
    }

    public void setSource(final Player inputSource) {
        logger.info("SoundSystem input source set to {}", inputSource.getName());
    }

    public void setSoundMode(final SoundModeType soundMode) {
        logger.info("SoundSystem sound mode set to {}", soundMode.name());
    }
}
