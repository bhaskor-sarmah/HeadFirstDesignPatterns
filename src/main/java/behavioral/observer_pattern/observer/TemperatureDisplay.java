package behavioral.observer_pattern.observer;

import behavioral.observer_pattern.subject.WeatherStationData;

public class TemperatureDisplay extends Observer {

  @Override
  public void update(final WeatherStationData weatherStationData) {
    System.out.println(
        "The current temperature is " + weatherStationData.getTemperature() + " degree celsius.");
  }
}
