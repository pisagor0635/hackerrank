import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        StringBuilder inverseBinary = new StringBuilder();
        while (number > 1) {
            int remainder = number % 2;
            inverseBinary.append(remainder);
            number = (number - remainder) / 2;
        }
        inverseBinary.append(number);
        int consecutive1s = 0;
        int max = 0;
        for (int i = 0; i < inverseBinary.length(); i++) {
            if (inverseBinary.charAt(i) == '1') {
                consecutive1s++;
            } else {
                consecutive1s = 0;
            }
            if (consecutive1s > max) {
                max = consecutive1s;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
