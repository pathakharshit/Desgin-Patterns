package Observer_Pattern.display;

import Observer_Pattern.model.WeatherMeasurement;
import Observer_Pattern.observer.Observer;
import Observer_Pattern.observer.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTmp = Float.MIN_VALUE;
    private float minTmp = Float.MAX_VALUE;
    private float totalTmp = 0.0f;
    private int readingCount;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        float avgTmp = totalTmp / readingCount;
        System.out.println("Avg/Max/Min temperature = " + avgTmp + "/" + maxTmp + "/" + minTmp);
    }

    @Override
    public void update(WeatherMeasurement measurement) {
        maxTmp = Math.max(maxTmp, measurement.temperature());
        minTmp = Math.min(minTmp, measurement.temperature());
        totalTmp += measurement.temperature();
        readingCount++;
        display();
    }
}
