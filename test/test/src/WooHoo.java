import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WooHoo {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter("output.txt");
        Scanner scanner = new Scanner(new File("input.txt"));

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        writer.print(a + b);
        writer.close();
    }
}