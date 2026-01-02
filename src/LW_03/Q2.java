package LW_03;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            System.out.print("Enter temperature in Fahrenheit: ");
        }

        double fahrenheit = scanner.nextDouble();
        Temperature temperature = new Temperature();
        temperature.setFahrenheit(fahrenheit);

        System.out.println("Temperature in Celsius: " + temperature.toCelsius());

        scanner.close();
    }
}
