package LW_04;

import java.util.Scanner;

public class Q4 {
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");

        scanner.close();
    }
}
