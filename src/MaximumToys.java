import java.util.Arrays;

public class MaximumToys {
    public static void main(String[] args) {
        int k = 7;
        int[] prices = {1,2,3,4};

        System.out.println(maximumToys(prices,k));
    }

    static int maximumToys(int[] prices, int k) {
        int numberOfToys = 0;
        Arrays.sort(prices);
        for (int price : prices) {
            k -= price;
            if (k >= 0) {
                numberOfToys++;
            } else {
                break;
            }
        }
        return numberOfToys;
    }
}
