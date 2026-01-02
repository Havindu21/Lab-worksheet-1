package LW_02;

public class Q1 {
    public static void main(String[] args) {
        for (int i = 10; i < 50; i++) {
            System.out.print(i);
            System.out.print(i % 10 == 9 ? "\n" : " ");
        }
    }
}
