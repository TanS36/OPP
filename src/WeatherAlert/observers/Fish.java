package WeatherAlert.observers;

import WeatherAlert.weather.WeatherType;

public class Fish implements WeatherObserver {
    @Override
    public void update(WeatherType weather) {
        if (weather == WeatherType.FLOOD) {
            System.out.println("Рыбы: Отличная погода! Время плавать и поесть крабсбургеров!");
        } else {
            System.out.println("Рыбы: Остаёмся дома, плохая погода и губка боб не пришел.");
        }
    }
}
