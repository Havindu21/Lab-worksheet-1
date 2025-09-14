package LW_01;

public class Circle {
    private final int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return 3.14 * radius * radius;
    }

    public double computeCircumference() {
        return 2 * 3.14 * radius;
    }
}
