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

        double areaO = co.computeArea();
        double areaI = ci.computeArea();
        double area = areaO - areaI;

        System.out.println("Area of the circular region is: " + area);
        System.out.println("Circumference of outer circle: " + co.computeCircumference());
        System.out.println("Circumference of inner circle: " + ci.computeCircumference());
    }
}
