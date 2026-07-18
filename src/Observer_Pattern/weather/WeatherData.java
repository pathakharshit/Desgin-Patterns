package Observer_Pattern.weather;

import Observer_Pattern.model.WeatherMeasurement;
import Observer_Pattern.observer.Observer;
import Observer_Pattern.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    private WeatherMeasurement measurement;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(measurement);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.measurement = new WeatherMeasurement(temperature, humidity, pressure);
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }
}
