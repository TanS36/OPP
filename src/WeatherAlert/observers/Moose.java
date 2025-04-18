package WeatherAlert.observers;

import WeatherAlert.weather.WeatherType;

public class Moose implements WeatherObserver {
    @Override
    public void update(WeatherType weather) {
        if (weather == WeatherType.EARTHQUAKE) {
            System.out.println("Лоси: Землетрясение? Да это как массаж! Погуляем.");
        } else {
            System.out.println("Лоси: Не та погода для прогулок...");
        }
    }
}
