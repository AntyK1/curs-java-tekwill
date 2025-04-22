package homework4.temperature;

public class TemperatureConverter {

    //Convert Fahrenheit to Celsius
    public static int toCelsius(int F) {
        return (5*(F-32))/9;
    }

    //Convert Celsius to Fahrenheit
    public static int toFahrenheit(int C) {
        return (9*C + (32*5))/5;
    }
}
