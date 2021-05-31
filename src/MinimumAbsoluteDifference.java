import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>(Arrays.asList(3, -7, 0));
        List<Integer> arr = new ArrayList<>(Arrays.asList(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75));

        System.out.println(minimumAbsoluteDifference(arr));
    }

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int minAbsDif = Integer.MAX_VALUE;
        List<Integer> sorted = arr.stream().sorted().distinct().collect(Collectors.toList());
        if (sorted.size() != arr.size()) {
            return 0;
        }

        for (int i = 0; i < sorted.size() - 1; i++) {
            int tempDifference = Math.abs(sorted.get(i) - sorted.get(i + 1));
            if (tempDifference < minAbsDif) {
                minAbsDif = tempDifference;
            }
        }

        return minAbsDif;
    }

}
