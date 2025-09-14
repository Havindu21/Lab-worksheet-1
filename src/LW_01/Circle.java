package LW_01;

public class Circle {
    private final int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public int computeArea() {
        return (int) (3.14 * radius * radius);
    }

    public int computeCircumference() {
        return (int) (2 * 3.14 * radius);
    }
}
