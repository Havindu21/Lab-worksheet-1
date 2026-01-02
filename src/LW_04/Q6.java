package LW_04;

public class Q6 {
    public static void main(String[] args) {
        for (int i = 10; i < 50; i++) {
            System.out.print(i);
            System.out.print(i % 10 == 9 ? "\n" : " ");
        }
    }
}
