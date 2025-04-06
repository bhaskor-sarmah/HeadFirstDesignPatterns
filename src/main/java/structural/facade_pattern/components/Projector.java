package structural.facade_pattern.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Projector {

    private static final Logger logger = LoggerFactory.getLogger(Projector.class);

    public void turnOn() {
        logger.info("Projector on");
    }

    public void turnOff() {
        logger.info("Projector off");
    }

    public void setSource(final Player inputSource) {
        logger.info("Projector input source set to {}", inputSource.getName());
    }

    public void setScreenWidth(final ScreenWidthType screenWidth) {
        logger.info("Projector screen width set to {}", screenWidth.name());
    }
}
