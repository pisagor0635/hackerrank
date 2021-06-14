import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class GreedyFlorist {

    public static void main(String[] args) {
        //test case
        int[] pricesOfFlowers = {390225, 426456, 688267, 800389, 990107, 439248, 240638, 15991, 874479, 568754, 729927, 980985, 132244, 488186, 5037, 721765,
                251885, 28458, 23710, 281490, 30935, 897665, 768945, 337228, 533277, 959855, 927447, 941485, 24242, 684459, 312855, 716170, 512600, 608266,
                779912, 950103, 211756, 665028, 642996, 262173, 789020, 932421, 390745, 433434, 350262, 463568, 668809, 305781, 815771, 550800};
        int numberOfFriends = 3;
        System.out.println(getMinimumCost(numberOfFriends, pricesOfFlowers));
    }

    static int getMinimumCost(int numberOfFriends, int[] pricesOfFlowers) {
        Integer[] prices = new Integer[pricesOfFlowers.length];

        for (int i = 0; i < pricesOfFlowers.length; i++) {
            prices[i] = pricesOfFlowers[i];
        }

        //Arrays.sort(prices, (n1, n2) -> n2.compareTo(n1));
        Arrays.sort(prices, Comparator.reverseOrder());

        int count = 0;
        int totalPrice = 0;

        if (numberOfFriends >= prices.length) {
            for (Integer price : prices) {
                totalPrice += price;
            }
        } else {
            int k = 0;
            for (Integer price:prices) {
                totalPrice += (k + 1) * price;
                count++;
                if (count % numberOfFriends == 0) {
                    count = 0;
                    k++;
                }
            }
        }
        return totalPrice;
    }

}
