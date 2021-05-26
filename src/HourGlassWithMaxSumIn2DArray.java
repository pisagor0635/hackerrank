import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HourGlassWithMaxSumIn2DArray {
    //https://www.hackerrank.com/challenges/30-2d-arrays/problem?h_r=next-challenge&h_v=zen
    public static void main(String[] args) throws IOException {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        firstRow.add(2);
        firstRow.add(0);
        firstRow.add(2);
        firstRow.add(1);
        firstRow.add(0);
        arr.add(0, firstRow);
        arr.add(1, firstRow);
        arr.add(2, firstRow);
        arr.add(3, firstRow);
        arr.add(4, firstRow);
        arr.add(5, firstRow);
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.size() - 3; i++) {
            for (int j = 0; j <= 2; j++) {
                sum = arr.get(i).get(j) + arr.get(i + 1).get(j) + arr.get(i + 2).get(j)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i).get(j + 2) + arr.get(i + 1).get(j + 2) + arr.get(i + 2).get(j + 2);

                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }

        }

        System.out.println(max);


    }
}
