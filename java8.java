import java.util.Scanner;

// WeatherData class
class WeatherData {
    // Private data members
    private double temperature;
    private double humidity;

    // Constructor
    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Method to check alerts
    public void checkAlert() {
        System.out.println("\n----- Weather Alerts -----");

        if (temperature > 40) {
            System.out.println("High Temperature Alert!");
        } 
        else if (temperature < 10) {
            System.out.println("Low Temperature Alert!");
        } 
        else {
            System.out.println("Temperature is Normal.");
        }

        if (humidity > 80) {
            System.out.println("High Humidity Alert!");
        } 
        else {
            System.out.println("Humidity is Normal.");
        }
    }

    // Method to display weather report
    public void displayReport() {
        System.out.println("\n----- Weather Report -----");
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + " %");
    }
}

// Main class
public class WeatherApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter Humidity: ");
        double hum = sc.nextDouble();

        // Creating object
        WeatherData wd = new WeatherData(temp, hum);

        // Calling methods
        wd.checkAlert();
        wd.displayReport();

        sc.close();
    }
}