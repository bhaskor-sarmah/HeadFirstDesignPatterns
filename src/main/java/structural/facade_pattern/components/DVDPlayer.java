package structural.facade_pattern.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DVDPlayer implements Player {

    private static final Logger logger = LoggerFactory.getLogger(DVDPlayer.class);
    private String currentMovie;

    @Override
    public String getName() {
        return "DVDPlayer";
    }

    @Override
    public void turnOn() {
        logger.info("DVDPlayer on");
    }

    @Override
    public void turnOff() {
        logger.info("DVDPlayer off");
    }

    @Override
    public void loadMovie(final String movieName) {
        currentMovie = movieName;
        logger.info("DVDPlayer loading movie {}", movieName);
    }

    @Override
    public void eject() {
        logger.info("DVDPlayer ejecting DVD");
    }

    @Override
    public void play() {
        logger.info("DVDPlayer playing movie {}", currentMovie);
    }

    @Override
    public void stop() {
        logger.info("DVDPlayer stopping movie");
    }
}
