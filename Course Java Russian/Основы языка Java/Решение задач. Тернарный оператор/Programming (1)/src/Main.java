import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println((age < 21) ? "Нет" : "Да");

    }
}