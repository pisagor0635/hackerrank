import java.util.Arrays;

public class ArraysLeftRotation {

    public static void main(String[] args) {
        int d = 2;
        int[] a = {1, 2, 3, 4, 5};
        int[] rotated = rotLeft(a, d);
        Arrays.stream(rotated).forEach(System.out::println);
    }

    static int[] rotLeft(int[] a, int d) {
        if (d < 1 && d > Math.pow(10, 5)) {
            return new int[0];
        }
        if (d > a.length) {
            return new int[0];
        }
        int[] rotatedArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[(i + d) % a.length] < 1 && a[(i + d) % a.length] > Math.pow(10, 6)) {
                return new int[0];
            }
            rotatedArray[i] = a[(i + d) % a.length];
        }

        return rotatedArray;
    }

}
