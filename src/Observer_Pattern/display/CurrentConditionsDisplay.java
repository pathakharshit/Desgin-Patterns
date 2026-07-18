package Observer_Pattern.display;

import Observer_Pattern.model.WeatherMeasurement;
import Observer_Pattern.observer.Observer;
import Observer_Pattern.observer.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(WeatherMeasurement measurement) {
        this.temperature = measurement.temperature();
        this.humidity = measurement.humidity();
        display();
    }
}
