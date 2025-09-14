package LW_01;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your full name( ex: Havindu Hesara Fonseka ) : ");
        String fullName = input.nextLine();
        String[] nameParts = fullName.split(" ");
        if (nameParts.length == 3) {
            String formattedName = nameParts[2] + ", " + nameParts[0] + " " + nameParts[1].charAt(0) + ".";
            System.out.println("Your formatted name is " + formattedName);
        } else {
            System.out.println("Please enter a full name with first, middle, and last names.");
        }
    }
}
