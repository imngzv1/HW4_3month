import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        multiply(scanner.nextInt(), scanner.nextInt());
    }

    private static int multiply(int a, int b) {
        Scanner scanner = new Scanner(System.in);
        int c = a + b;
        System.out.println("Сумма: " + c);

        int v;
        if (a >= b) {
            v = a - b;
            System.out.println("Разность: " + v);
        } else {
            System.out.println("А должно быть быть больше чем B");
        }

        int d = a * b;
        System.out.println("Произведение: " + d);

        return multiply(scanner.nextInt(), scanner.nextInt());
    }
}