import java.util.Scanner;
import java.util.Random;

public class passGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random randomInt = new Random();

        char[] dictionary = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D',
                'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z', '~', '#', '$', '%', '^', '&', '*', '(',
                ')', '_', '-', '=', '+', '<', '>', '/', };

        System.out.print("Введите длинну пароля: ");
        int passLenght = scanner.nextInt(); //считал длинну пароля из консоли
        char[] passArray = new char[passLenght]; //создал массив по длине пароля

        for (int i = 0; i < passLenght; i++){
            int dictIndex = randomInt.nextInt(dictionary.length - 1); //сгенерировал след. индекс для символа
            char charNext = dictionary[dictIndex];  // взял случайный символ из словаря
            passArray[i] = charNext;    // сохранил в массив
        }
       String b = new String(passArray);    // преобразовал пароль в строку
        System.out.println(b);
    }
}
