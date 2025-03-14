package behavioral.observer_pattern

import behavioral.observer_pattern.observer.HumidityDisplay
import behavioral.observer_pattern.observer.TemperatureDisplay
import behavioral.observer_pattern.subject.WeatherStation
import spock.lang.Specification

class ObserverPatternSpec extends Specification {

    def "weather station should notify observers with updated measurements"() {
        given: "A weather station and two observers"
        def weatherStation = new WeatherStation()
        def temperatureObserver = Spy(TemperatureDisplay); // Ensure Observer is an interface or abstract class
        def humidityObserver = Spy(HumidityDisplay);

        when: "Observers are added and measurements are updated"
        weatherStation.addObserver(temperatureObserver)
        weatherStation.addObserver(humidityObserver)
        weatherStation.updateMeasurements(22L, 55L)

        then: "Observers should receive the updated measurements"
        1 * temperatureObserver.update({ it.temperature == 22L && it.humidity == 55L })
        1 * humidityObserver.update({ it.temperature == 22L && it.humidity == 55L })

        when: "Measurement are updated once again"
        weatherStation.updateMeasurements(25L, 49L)

        then: "Observers should receive the updated measurements"
        1 * temperatureObserver.update({ it.temperature == 25L && it.humidity == 49L })
        1 * humidityObserver.update({ it.temperature == 25L && it.humidity == 49L })
    }
}