import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HourGlassWithMaxSumIn2DArray {

    public static void main(String[] args) throws IOException {
        //test data
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        List<Integer> secondRow = new ArrayList<>();
        List<Integer> thirdRow = new ArrayList<>();
        List<Integer> fourthRow = new ArrayList<>();
        List<Integer> fifthRow = new ArrayList<>();
        List<Integer> sixthRow = new ArrayList<>();
        firstRow.add(0);
        firstRow.add(-4);
        firstRow.add(-6);
        firstRow.add(0);
        firstRow.add(-7);
        firstRow.add(6);
        arr.add(0, firstRow);
        secondRow.add(-1);
        secondRow.add(-2);
        secondRow.add(-6);
        secondRow.add(-8);
        secondRow.add(-3);
        secondRow.add(-1);
        arr.add(1, secondRow);
        thirdRow.add(-8);
        thirdRow.add(-4);
        thirdRow.add(-2);
        thirdRow.add(-8);
        thirdRow.add(-8);
        thirdRow.add(-6);
        arr.add(2, thirdRow);
        fourthRow.add(-3);
        fourthRow.add(-1);
        fourthRow.add(-2);
        fourthRow.add(-5);
        fourthRow.add(-7);
        fourthRow.add(-4);
        arr.add(3, fourthRow);
        fifthRow.add(-3);
        fifthRow.add(-5);
        fifthRow.add(-3);
        fifthRow.add(-6);
        fifthRow.add(-6);
        fifthRow.add(-6);
        arr.add(4, fifthRow);
        sixthRow.add(-3);
        sixthRow.add(-6);
        sixthRow.add(0);
        sixthRow.add(-8);
        sixthRow.add(-6);
        sixthRow.add(-7);
        arr.add(5, sixthRow);
        //test data
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j <= 3; j++) {
                sum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);

                if (sum > max) {
                    max = sum;
                }
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
