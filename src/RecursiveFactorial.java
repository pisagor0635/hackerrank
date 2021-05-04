import java.io.IOException;
import java.util.Scanner;

public class RecursiveFactorial {
    static int factorial = 1;

    static int factorial(int n) {
        if (n >= 1) {
            factorial = n * factorial(n - 1);
        }
        return factorial;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = sc.nextInt();
        System.out.println(number + "! = " + factorial(number));
        sc.close();
    }
}
