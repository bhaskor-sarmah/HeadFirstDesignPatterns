package behavioral.observer_pattern.observer;

import behavioral.observer_pattern.subject.WeatherStationData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumidityDisplay extends Observer {

  private static final Logger logger = LoggerFactory.getLogger(HumidityDisplay.class);

  @Override
  public void update(final WeatherStationData weatherStationData) {
      logger.info("The current humidity is {}% .", weatherStationData.getHumidity());
  }

}
