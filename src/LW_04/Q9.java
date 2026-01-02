package LW_02;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        if (rows <= 0) {
            System.out.println("Number of rows must be positive.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= rows; i++) {
            for (int s = 0; s < rows - i; s++) {
                System.out.print(" ");
            }
            for (int star = 0; star < (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
