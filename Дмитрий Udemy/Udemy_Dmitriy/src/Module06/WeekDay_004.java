package Module06;

//Реализовать программу WeekDay, которая запрашивает номер дня недели (от 1 до 7 включительно),
// а затем отображает название дня недели: Если 1, то Monday (Понедельник), если 2, то Tuesday (Вторник) и т.д.
//
//Названия всех дней недели на английском:
//
//"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"

import java.util.Scanner;

public class WeekDay_004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 7)
            System.out.println("Такого дня недели не существует");
        else switch (day) {
            case 1 -> System.out.printf("%d день недели - Monday", day);
            case 2 -> System.out.printf("%d день недели - Tuesday", day);
            case 3 -> System.out.printf("%d день недели - Wednesday", day);
            case 4 -> System.out.printf("%d день недели - Thursday", day);
            case 5 -> System.out.printf("%d день недели - Friday", day);
            case 6 -> System.out.printf("%d день недели - Saturday", day);
            case 7 -> System.out.printf("%d день недели - Sunday", day);
        }

    }
}
