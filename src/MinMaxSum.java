import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        Long minSum = 0L;
        Long maxSum = 0L;
        Collections.sort(arr);
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
            maxSum += arr.get(4 - i);
        }
        System.out.println(minSum + "  " + maxSum);
    }
}
