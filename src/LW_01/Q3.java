package LW_01;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input length in centimeters : ");
        int cm = input.nextInt();
        int inches = (int) (cm / 2.54);
        int feet = inches / 12;
        inches = inches % 12;
        System.out.println("Length is " + feet + " feet and " + inches + " inches");
    }
}
