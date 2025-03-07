package behavioral.observer_pattern.subject;

public class WeatherStationData {

  long temperature;
  long humidity;

  public void setTemperature(final long temperature) {
    this.temperature = temperature;
  }

  public void setHumidity(final long humidity) {
    this.humidity = humidity;
  }

  public long getTemperature() {
    return this.temperature;
  }

  public long getHumidity() {
    return this.humidity;
  }
}
