package Module05;

//Реализовать программу SwapVariables, которая меняет местами значение переменных a и b.

import java.util.Scanner;

public class SwapVariables_013 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int c;

        System.out.printf("a = %d, b = %d\n", a, b);
        c = b;
        b = a;
        a = c;
        System.out.printf("a = %d, b = %d", a, b);

    }
}
