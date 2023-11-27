package Weather_O_Rama;

public class WeatherData {

    // getTemperature()
    // getHumidity()
    // getPressure()
    // measurementsChanged()

    /**
     * 기상 관측값이
     * 갱신될 때마다
     * 이 메소드가 호출됩니다
     */
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecaseDisplay.update(temp, humidity, pressure);
    }
}