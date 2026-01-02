package LW_04;

import java.util.Scanner;

public class Q5 {
    private static int readChoice(Scanner scanner, int min, int max) {
        while (true) {
            System.out.print("Enter choice (" + min + "-" + max + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
                System.out.print("Enter choice (" + min + "-" + max + "): ");
            }
            int choice = scanner.nextInt();
            if (choice >= min && choice <= max) {
                return choice;
            }
            System.out.println("Choice out of range.");
        }
    }

    public static void main(String[] args) {
        String[] entrees = {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"};
        double[] entreePrices = {3.49, 4.59, 3.99, 2.99};

        String[] sides = {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"};
        double[] sidePrices = {0.79, 0.69, 1.09, 0.59};

        String[] drinks = {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"};
        double[] drinkPrices = {1.99, 1.90, 2.49, 0.99};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entree:");
        for (int i = 0; i < entrees.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, entrees[i], entreePrices[i]);
        }
        int entreeChoice = readChoice(scanner, 1, entrees.length) - 1;

        System.out.println("\nSide Dish:");
        for (int i = 0; i < sides.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, sides[i], sidePrices[i]);
        }
        int sideChoice = readChoice(scanner, 1, sides.length) - 1;

        System.out.println("\nDrink:");
        for (int i = 0; i < drinks.length; i++) {
            System.out.printf("%d. %s - $%.2f%n", i + 1, drinks[i], drinkPrices[i]);
        }
        int drinkChoice = readChoice(scanner, 1, drinks.length) - 1;

        double total = entreePrices[entreeChoice] + sidePrices[sideChoice] + drinkPrices[drinkChoice];

        System.out.println("\nYour order:");
        System.out.printf("Entree: %s ($%.2f)%n", entrees[entreeChoice], entreePrices[entreeChoice]);
        System.out.printf("Side: %s ($%.2f)%n", sides[sideChoice], sidePrices[sideChoice]);
        System.out.printf("Drink: %s ($%.2f)%n", drinks[drinkChoice], drinkPrices[drinkChoice]);
        System.out.printf("Total: $%.2f%n", total);

        scanner.close();
    }
}
