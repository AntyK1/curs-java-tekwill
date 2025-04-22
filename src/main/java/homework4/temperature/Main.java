package homework4.temperature;

public class Main {
    public static void main (String[] args) {
        TemperatureConverter convers = new TemperatureConverter();


        int resultC = convers.toCelsius(100);
        int resultF = convers.toFahrenheit(100);

        //Display result:
        System.out.println("Fahrenheit to Celsius: " + resultC);
        System.out.println("Celsius to Fahrenheit: " + resultF);
    }
}
