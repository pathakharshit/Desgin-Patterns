package Observer_Pattern.observer;

import Observer_Pattern.model.WeatherMeasurement;

public interface Observer {
    void update(WeatherMeasurement measurement);
}
