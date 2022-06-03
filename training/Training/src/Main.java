import java.sql.Array;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int arrayLength = random.nextInt(4, 5); // √нерим размер массива

        int[] array = new int[arrayLength];
        System.out.println("–азмер массива = " + array.length);

        for (int i = 0; i < array.length; i++){
            int randomInt = random.nextInt(1000);
            array[i] = randomInt;
            System.out.println("Ёлемент[" + i + "] = " + array[i]);
        }
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min ){
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }

            sum = sum + array[i];
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Avg = " + sum / array.length);




    }
}