package LW_04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Map<Integer, String> names = new HashMap<>();
        names.put(6, "Million");
        names.put(9, "Billion");
        names.put(12, "Trillion");
        names.put(15, "Quadrillion");
        names.put(18, "Quintillion");
        names.put(21, "Sextillion");
        names.put(30, "Nonillion");
        names.put(100, "Googol");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a power of 10 (e.g., 6, 9, 12): ");
        int power = scanner.nextInt();

        String word = names.get(power);
        if (word == null) {
            System.out.println("No corresponding word for 10^" + power);
        } else {
            System.out.println("10^" + power + " is a " + word);
        }

        scanner.close();
    }
}
