import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n, m, k;
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();

        System.out.print((k%n==0 || k%m==0) && m*n>=k ? "YES":"NO");

        /*if ((n * m > k) && (k<=30000) &&(k % n == 0 || k % m == 0))
            System.out.println("Yes");
        else System.out.println("No");*/


    }
}