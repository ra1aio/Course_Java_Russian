import java.util.Scanner;

class Programm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[][] mas = new int[n][];
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            int[] a = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++)
                a[j] = Integer.parseInt(numbers[j]);
            mas[i] = a;
        }
        int ans = find_line7(mas);
        if (ans != -1)
            System.out.println("����� ������ ��� ������� " + (ans + 1) + " ������ 7");
        else
            System.out.println("����� ����� ���");
    }

    //���������� ���� �������, �������� �����
}