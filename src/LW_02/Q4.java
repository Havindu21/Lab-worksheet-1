package LW_02;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] values = new int[5];
        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            values[i] = scanner.nextInt();
        }

        Integer largest = null;
        Integer secondLargest = null;

        for (int value : values) {
            if (largest == null || value > largest) {
                if (largest != null && value != largest) {
                    secondLargest = largest;
                }
                largest = value;
            } else if (value != largest && (secondLargest == null || value > secondLargest)) {
                secondLargest = value;
            }
        }

        System.out.println("Second largest value: " + secondLargest);

        scanner.close();
    }
}
