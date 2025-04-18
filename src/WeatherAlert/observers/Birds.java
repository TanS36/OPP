package WeatherAlert.observers;

import WeatherAlert.weather.WeatherType;

public class Birds implements WeatherObserver {
    @Override
    public void update(WeatherType weather) {
        if (weather == WeatherType.STORM) {
            System.out.println("Птицы: Буря! Отлично летаем и уничтожать свиней!");
        } else {
            System.out.println("Птицы: Сидим в гнезде, опасно :( .");
        }
    }
}
