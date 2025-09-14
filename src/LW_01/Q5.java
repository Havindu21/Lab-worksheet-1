package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Radius of outer circle : ");
        int ro = input.nextInt();

        System.out.print("Radius of inner circle : ");
        int ri = input.nextInt();

        Circle co = new Circle(ro);
        Circle ci = new Circle(ri);

        int areaO = co.computeArea();
        int areaI = ci.computeArea();
        int area = areaO - areaI;

        System.out.println("Area of the circular region is: " + area);
    }
}
