package WeatherAlert.observers;

import WeatherAlert.weather.WeatherType;

public interface WeatherObserver {
    void update(WeatherType weather);
}
