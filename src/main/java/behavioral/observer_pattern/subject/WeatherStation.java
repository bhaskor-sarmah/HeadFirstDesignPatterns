package behavioral.observer_pattern.subject;

import behavioral.observer_pattern.observer.Observer;

public class WeatherStation extends Subject {

  private final WeatherStationData weatherStationData;

  public WeatherStation() {
    weatherStationData = new WeatherStationData();
  }

  @Override
  public void addObserver(final Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(final Observer observer) {
    observers.remove(observer);
  }

  @Override
  protected void notifyObserver() {
    for (Observer observer : observers) {
      observer.update(weatherStationData);
    }
  }

  public void updateMeasurements(final long temperature, final long humidity) {
    weatherStationData.setTemperature(temperature);
    weatherStationData.setHumidity(humidity);
    notifyObserver();
  }
}
