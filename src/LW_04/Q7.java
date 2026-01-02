package LW_04;

import java.util.Scanner;

public class Q7 {
    public static int digitCount(int value) {
        value = Math.abs(value);
        if (value == 0) {
            return 1;
        }
        int count = 0;
        while (value > 0) {
            count++;
            value /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (negative to stop): ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next();
                continue;
            }

            int value = scanner.nextInt();
            if (value < 0) {
                break;
            }

            System.out.println("Number of digits: " + digitCount(value));
        }

        scanner.close();
    }
}
