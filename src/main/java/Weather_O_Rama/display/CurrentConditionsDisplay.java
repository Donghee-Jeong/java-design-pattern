package Weather_O_Rama.display;

import Weather_O_Rama.DisplayElement;
import Weather_O_Rama.Observer;
import Weather_O_Rama.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("온도 : " + temperature + ", 습도 : " + humidity);
    }
}
