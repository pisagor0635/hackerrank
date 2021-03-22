import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HourGlass {

    public static void main(String[] args) {
        //test data
    }


    static int hourglassSum(int[][] arr) {
        List<Integer> sums = new ArrayList<Integer>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                sums.add(sum);
            }
        }
        Collections.sort(sums);
        return sums.get(sums.size() - 1);


    }
}
