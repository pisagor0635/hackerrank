public class MinimumAbsoluteDifferenceInArray {

    public static void main(String[] args) {
        int[] a = {3, -7, 0};
        System.out.println(minimumAbsoluteDifference(a));
    }

    static int minimumAbsoluteDifference(int[] arr) {
        int min = 1000000000;
        int fark = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                fark = arr[i] - arr[j];
                if (fark < 0) {
                    fark = -1 * fark;
                }
                if (fark < min) {
                    min = fark;
                }
            }
        }

        return min;
    }
}
