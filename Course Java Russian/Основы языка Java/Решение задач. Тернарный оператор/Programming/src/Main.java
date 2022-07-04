import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age<21)
            System.out.println("Нет");
        else System.out.println("Да");

    }
}