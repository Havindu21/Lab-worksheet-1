package LW_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an odd length word : ");
        String word = input.nextLine();
        int length = word.length();
        if (length % 2 == 0) {
            System.out.println("Input an odd length word");
        } else {
            int midIndex = length / 2;
            char midChar = word.charAt(midIndex);
            System.out.println("The middle character in " + word + " is " + midChar);
        }
    }
}