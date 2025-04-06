package structural.facade_pattern.components;

public interface Player {
    String getName();

    void turnOn();

    void turnOff();

    void loadMovie(final String movie);

    void eject();

    void play();

    void stop();
}
