package Observer_Pattern.display;

import Observer_Pattern.model.WeatherMeasurement;
import Observer_Pattern.observer.Observer;
import Observer_Pattern.observer.Subject;

public class ForeCastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForeCastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast: " + (currentPressure > lastPressure ? "Improving" : "Worsening"));
    }

    @Override
    public void update(WeatherMeasurement measurement) {
        lastPressure = currentPressure;
        currentPressure = measurement.pressure();
        display();
    }
}
