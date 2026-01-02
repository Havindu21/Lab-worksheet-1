package LW_04;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int guess;

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                System.out.print("Guess a number between 1 and 100: ");
            }
            guess = scanner.nextInt();

            if (guess < secret) {
                System.out.println("Higher");
            } else if (guess > secret) {
                System.out.println("Lower");
            } else {
                System.out.println("Correct!");
                break;
            }
        }

        scanner.close();
    }
}
