public class MinimumSwaps2 {

    public static void main(String[] args) {
//        int[] numbers = {7, 1, 3, 2, 4, 5, 6};
//        int[] numbers = {4,3,1,2};
        int[] numbers = {1, 3, 5, 2, 4, 6, 7};

        System.out.println(minimumSwaps(numbers));

    }

    static int minimumSwaps(int[] arr) {
        int numberOfSwap = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                numberOfSwap++;
                i--;
            }
        }

        return numberOfSwap;
    }

}
