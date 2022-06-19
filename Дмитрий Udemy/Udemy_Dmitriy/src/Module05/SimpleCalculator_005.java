package Module05;

//Реализовать программу SimpleCalculator, которая запрашивает с консоли переменные a и b и
// выводит результат всех арифметических операций в формате: операнд1 операция операнд2 равно результат.

import java.util.Scanner;

public class SimpleCalculator_005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите а: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();

        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b);
        System.out.printf("%d %% %d = %d\n", a, b, a % b);

        
    }
}
