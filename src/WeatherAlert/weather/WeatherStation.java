package WeatherAlert.weather;

import WeatherAlert.observers.WeatherObserver;
import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private List<WeatherObserver> observers = new ArrayList<>();
    private WeatherType currentWeather;

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void setWeather(WeatherType weather) {
        this.currentWeather = weather;
        System.out.println("\n=== Погода изменилась на: " + weather + " ===");
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(currentWeather);
        }
    }
}

