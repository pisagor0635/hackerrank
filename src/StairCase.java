public class StairCase {
    public static void main(String[] args) {
        int n = 10;
        staircase(n);
    }

    public static void staircase(int n) {
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n - j; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
