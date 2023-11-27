package Weather_O_Rama.display;

import Weather_O_Rama.DisplayElement;
import Weather_O_Rama.Observer;
import Weather_O_Rama.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("지난 기압 : " + lastPressure + ", 최근 기압 : " + currentPressure);
    }
}
