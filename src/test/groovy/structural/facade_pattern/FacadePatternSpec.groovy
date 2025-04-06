package structural.facade_pattern

import spock.lang.Specification
import structural.facade_pattern.components.Light
import structural.facade_pattern.components.Player
import structural.facade_pattern.components.Projector
import structural.facade_pattern.components.Screen
import structural.facade_pattern.components.ScreenWidthType
import structural.facade_pattern.components.SoundModeType
import structural.facade_pattern.components.SoundSystem

class FacadePatternSpec extends Specification {

    def "startMovie should coordinate all components correctly"() {
        given:
        def movieName = "Forrest Gump"
        def lightIntensity = 10
        def screenWidth = ScreenWidthType.WIDE_16_9
        def soundMode = SoundModeType.SURROUND_SOUND
        def dvdPlayer = Mock(Player)
        def soundSystem = Mock(SoundSystem)
        def light = Mock(Light)
        def screen = Mock(Screen)
        def projector = Mock(Projector)

        def facade = new HomeEntertainmentSystemFacade(dvdPlayer, soundSystem, light, screen, projector)

        when:
        facade.startMovie(movieName, lightIntensity, screenWidth, soundMode)

        then:
        1 * light.turnOn()
        1 * light.dimLight(lightIntensity)

        1 * dvdPlayer.turnOn()
        1 * dvdPlayer.loadMovie(movieName)

        1 * screen.lowerScreen()

        1 * projector.turnOn()
        1 * projector.setScreenWidth(screenWidth)
        1 * projector.setSource(dvdPlayer)

        1 * soundSystem.turnOn()
        1 * soundSystem.setSoundMode(soundMode)
        1 * soundSystem.setSource(dvdPlayer)

        1 * dvdPlayer.play()
    }

    def "stopMovie should shut down all components properly"() {
        given:
        def dvdPlayer = Mock(Player)
        def soundSystem = Mock(SoundSystem)
        def light = Mock(Light)
        def screen = Mock(Screen)
        def projector = Mock(Projector)

        def facade = new HomeEntertainmentSystemFacade(dvdPlayer, soundSystem, light, screen, projector)

        when:
        facade.stopMovie()

        then:
        1 * projector.turnOff();
        1 * screen.pullUpScreen();
        1 * soundSystem.turnOff();
        1 * dvdPlayer.turnOff();
        1 * light.turnOff();
    }
}
