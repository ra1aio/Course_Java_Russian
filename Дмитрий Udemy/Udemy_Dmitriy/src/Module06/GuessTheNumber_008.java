package Module06;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber_008 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Я загадал число от 1 до 9.");
            //Генерим число
            int num = new Random().nextInt(1, 10);
            //Контролька
            System.out.println(num);
            System.out.print("Введи число от 1 до 9. Или введи 0 для выхода: ");
            //Получаем число от игрока
            int userNum = new Scanner(System.in).nextInt();
            if (userNum == 0) {
                System.out.println("Exit");
                break;
            }
            while (true) {
                if (userNum < num) {
                    System.out.println("Твоё число меньше загаданного.");
                    System.out.print("Введи число от 1 до 9: ");
                    userNum = new Scanner(System.in).nextInt();
                }
                else if (userNum > num) {
                    System.out.println("Твоё число больше загадонного.");
                    System.out.print("Введи число от 1 до 9: ");
                    userNum = new Scanner(System.in).nextInt();
                }
                else {
                    System.out.println("Поздравляю! Ты выйграл.");
                    System.out.println();
                    break;
                }
            }
        }


    }

}

