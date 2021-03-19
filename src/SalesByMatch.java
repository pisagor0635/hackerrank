import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SalesByMatch {

    public static void main(String[] args) {

        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(7, socks));

    }

    static int sockMerchant(int n, int[] ar) {

        if (n < 1 || n > 100) {
            return 0;
        }

        int totalcount = 0;

        Set<Integer> colors = new HashSet<>();
        colors.addAll(Arrays.stream(ar).boxed().collect(Collectors.toList()));

        for (int c : colors) {
            int count = 0;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] < 1 || ar[i] > 100) {
                    return 0;
                }
                if (c == ar[i]) {

                    count++;
                }
                if (count == 2) {
                    totalcount += 1;
                    count = 0;
                }
            }
        }
        return totalcount;
    }
}