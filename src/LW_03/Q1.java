package LW_03;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            System.out.print("Enter temperature in Celsius: ");
        }

        double celsius = scanner.nextDouble();
        Temperature temperature = new Temperature(celsius);

        System.out.println("Temperature in Fahrenheit: " + temperature.toFahrenheit());

        scanner.close();
    }
}
