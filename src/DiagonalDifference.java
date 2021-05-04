import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int i = 0;
        int sumRightDiagonal = 0;
        int sumLeftDiagonal = 0;
        int size = arr.size();
        for(List<Integer> lst:arr){
            sumRightDiagonal += lst.get(i);
            sumLeftDiagonal += lst.get(size - 1 - i);
            i++;
        }

        return Math.abs(sumRightDiagonal - sumLeftDiagonal);
    }
}
