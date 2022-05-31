import java.util.Scanner;
//import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double[] expenses = new double[7];

        double rateUSD = 78.5;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("������� ����� � ��� �������� �� ��������?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("������� ���� �� ��������?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("��� �� ������ �������?");
            System.out.println("1 - �������������� ������");
            System.out.println("2 - �������� �����");
            System.out.println("3 - ������ �����");
            System.out.println("4 - �������� ����� �� ������");
            System.out.println("5 - �������� ����� ������� ����� �������� �� ������");
            System.out.println("0 - �����");

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("���� ����������: " + moneyBeforeSalary + " RUB");
                System.out.println("� ����� ������ ������ ��������������? ��������� ��������: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                if (currency == 1) {
                    System.out.println("���� ���������� � ��������: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("���� ���������� � ����: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("���� ���������� � �����: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("����������� ������");
                }
            } else if (command == 2) {
                if (moneyBeforeSalary < 3000) {
                    System.out.println("������� ����� ������ ����. ���������, � �� �������� �� ��������!");
                } else if (moneyBeforeSalary < 10000){
                    if (daysBeforeSalary < 10) {
                        System.out.println("����, ���� � ������!");
                    } else {
                        System.out.println("������� ����� ������ ����. ���������, � �� �������� �� ��������!");
                    }
                } else if (moneyBeforeSalary < 30000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("�������! ��������� �������� � ������� ��������� � �������� �����. :)");
                    } else {
                        System.out.println("����, ���� � ������!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("�������! ����������� ������!");
                    } else {
                        System.out.println("�������! ��������� �������� � ������� ��������� � �������� �����. :)");
                    }
                }
            } else if (command == 3) {
                System.out.println("�� ����� ���� �� ������ ������ �����: 1-��, 2-��, 3-��, 4-��, 5-��, 6-��, 7-��?");
                int day = scanner.nextInt();
                System.out.println("������� ������ �����:");
                double expense = scanner.nextDouble();
                moneyBeforeSalary = moneyBeforeSalary - expense;
                expenses[day - 1] = expenses[day - 1] + expense;
                System.out.println("�������� ���������! ��� ������� ������ � ������: " + moneyBeforeSalary);
                if (moneyBeforeSalary < 1000) {
                    System.out.println("�� ����� ����� �������� ������ �������. ����� ������ ���������!");
                }
            } else if (command == 4) {   // �������� ��������� ��� ��������� ����� �������
                for (int i = 0; i < expenses.length; i++) {     // ����������� ���� for, ����� �������� ��� ����� � �������� ������� expenses
                    // ����������� � ����� ������: "���� _. ��������� _ ������.".
                    System.out.println("���� " + (i + 1) + ". " + "��������� " + expenses[i] + " ������.");
                }
            }else if (command == 5){
                    double maxExpense=0;

                    for (int i = 0; i < expenses.length; i ++){
                        if (expenses[i] > maxExpense){
                            maxExpense = expenses[i];
                        }
                    }
                    System.out.println("����� ������� ����� �������� �� ���� ������ ��������� " + maxExpense + " ���.");
            }
            else if (command == 0) {
                System.out.println("�����");
                break;
        } else {
            System.out.println("��������, ����� ������� ���� ���.");
        }
    }
    }
}