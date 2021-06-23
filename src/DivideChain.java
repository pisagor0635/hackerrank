import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivideChain {

    public static void main(String[] args) {
        int[] chain = {5, 2, 4, 1, 6, 3, 7};

        int minCost = minTotalCost(chain);

        System.out.println(minCost);

    }

    private static int minTotalCost(int[] chain) {
        List<Integer> totalCost = new ArrayList<>();

        for (int i = 1; i < chain.length - 1; i++) {
            for (int j = i + 2; j < chain.length - 1; j++) {
                totalCost.add(chain[i] + chain[j]);
            }
        }
        Collections.sort(totalCost);
        return totalCost.get(0);
    }
}
