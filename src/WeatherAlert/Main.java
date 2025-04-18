package WeatherAlert;
//Наблюдатель и не спрашивайте почему животные ходят в ужасную погоду, слишком скучно было ставить солнце
import WeatherAlert.weather.WeatherStation;
import WeatherAlert.weather.WeatherType;
import WeatherAlert.observers.*;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        station.addObserver(new Fish());
        station.addObserver(new Birds());
        station.addObserver(new Moose());

        station.setWeather(WeatherType.FLOOD);
        station.setWeather(WeatherType.STORM);
        station.setWeather(WeatherType.EARTHQUAKE);
    }
}

