package behavioral.observer_pattern.observer;

import behavioral.observer_pattern.subject.WeatherStationData;

public abstract class Observer {

    public abstract void update(final WeatherStationData weatherStationData);

}
