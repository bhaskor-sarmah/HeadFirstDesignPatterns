package structural.facade_pattern;

import structural.facade_pattern.components.DVDPlayer;
import structural.facade_pattern.components.Light;
import structural.facade_pattern.components.Player;
import structural.facade_pattern.components.Projector;
import structural.facade_pattern.components.Screen;
import structural.facade_pattern.components.ScreenWidthType;
import structural.facade_pattern.components.SoundModeType;
import structural.facade_pattern.components.SoundSystem;

public class HomeEntertainmentSystemFacade {

    private final Player player;
    private final SoundSystem soundSystem;
    private final Light light;
    private final Screen screen;
    private final Projector projector;

    public HomeEntertainmentSystemFacade(Player player, SoundSystem soundSystem, Light light, Screen screen, Projector projector) {
        this.player = player;
        this.soundSystem = soundSystem;
        this.light = light;
        this.screen = screen;
        this.projector = projector;
    }

    public void startMovie(final String movieName, final int lightIntensity, final ScreenWidthType screenWidth, final SoundModeType soundMode) {
        light.turnOn();
        light.dimLight(lightIntensity);

        player.turnOn();
        player.loadMovie(movieName);

        screen.lowerScreen();

        projector.turnOn();
        projector.setScreenWidth(screenWidth);
        projector.setSource(player);

        soundSystem.turnOn();
        soundSystem.setSoundMode(soundMode);
        soundSystem.setSource(player);

        player.play();
    }

    public void stopMovie() {
        projector.turnOff();
        screen.pullUpScreen();
        soundSystem.turnOff();
        player.turnOff();
        light.turnOff();
    }

}
