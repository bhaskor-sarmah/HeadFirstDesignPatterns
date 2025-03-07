package behavioral.observer_pattern.observer;

import behavioral.observer_pattern.subject.WeatherStationData;

public class HumidityDisplay extends Observer {

    @Override
    public void update(final WeatherStationData weatherStationData) {
        System.out.println("The current humidity is "+weatherStationData.getHumidity()+"% .");
    }
}
