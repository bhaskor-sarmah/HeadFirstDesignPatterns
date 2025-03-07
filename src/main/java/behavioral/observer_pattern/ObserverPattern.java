package behavioral.observer_pattern;

import behavioral.observer_pattern.observer.HumidityDisplay;
import behavioral.observer_pattern.observer.Observer;
import behavioral.observer_pattern.observer.TemperatureDisplay;
import behavioral.observer_pattern.subject.Subject;
import behavioral.observer_pattern.subject.WeatherStation;

public class ObserverPattern {

    public static void main(String[] args) {
        final Subject weatherStation = new WeatherStation();

        final Observer temperatureObserver = new TemperatureDisplay();
        final Observer humidityObserver = new HumidityDisplay();

        weatherStation.addObserver(temperatureObserver);
        weatherStation.addObserver(humidityObserver);

        weatherStation.updateMeasurements(22L, 55L);

        weatherStation.updateMeasurements(25L, 49L);

        weatherStation.removeObserver(temperatureObserver);

        weatherStation.updateMeasurements(28L, 44L);
    }

}
