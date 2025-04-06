package structural.facade_pattern;

import structural.facade_pattern.components.DVDPlayer;
import structural.facade_pattern.components.Light;
import structural.facade_pattern.components.Player;
import structural.facade_pattern.components.Projector;
import structural.facade_pattern.components.Screen;
import structural.facade_pattern.components.ScreenWidthType;
import structural.facade_pattern.components.SoundModeType;
import structural.facade_pattern.components.SoundSystem;

public class FacadePattern {
    public static void main(String[] args) {

        final Player dvdPlayer = new DVDPlayer();
        final SoundSystem soundSystem = new SoundSystem();
        final Projector projector = new Projector();
        final Screen screen = new Screen();
        final Light light = new Light();
        final String movie = "Forrest Gump";
        final int lightIntensity = 10;

        final HomeEntertainmentSystemFacade homeEntertainmentSystemFacade =
                new HomeEntertainmentSystemFacade(dvdPlayer, soundSystem, light, screen, projector);

        homeEntertainmentSystemFacade.startMovie(movie, lightIntensity, ScreenWidthType.WIDE_16_9, SoundModeType.SURROUND_SOUND);

        homeEntertainmentSystemFacade.stopMovie();
    }
}
