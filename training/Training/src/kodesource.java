import java.util.Scanner;

public class kodesource {
    public static void main(String[] args) {
        Array array = new Array();
        Scanner scan = new Scanner(System.in);
        System.out.print("¬ведите размер массива: ");
        array.arrayFinish = scan.nextInt();

        int myArray[] = array.createArray();
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }
}
class Array{
    int arrayFinish;
    int[] createArray(){
        int[] array = new int[arrayFinish];
        for (int i = 0; i < arrayFinish; i++){
            array[i] = i;
        }
        return array;
    }

}