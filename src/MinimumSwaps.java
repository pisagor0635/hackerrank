public class MinimumSwaps {

    public static void main(String[] args) {
//        int[] a = {1, 3, 5, 2, 4, 6, 7};
        int[] a = {3, 7, 6, 9, 1, 8, 10, 4, 2, 5};


        System.out.println(minimumSwaps(a));
    }

    static int minimumSwaps(int[] arr) {
        int temp;
        int temp2;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = j;
                }
            }
            if (temp > 0) {
                temp2 = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp2;
                //i--;
                count++;
            }
        }
        return count;
    }
}
