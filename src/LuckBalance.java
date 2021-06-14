import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LuckBalance {

    public static int luckBalance(int k, List<List<Integer>> contests) {

        int totalLuck = 0;

        List<Integer> importance0s = new ArrayList<>();
        List<Integer> importance1s = new ArrayList<>();

        for (int i = 0; i < contests.size(); i++) {

            if (contests.get(i).get(1) == 0) {
                importance0s.add(contests.get(i).get(0));
            } else {
                importance1s.add(contests.get(i).get(0));
            }
        }
        Collections.sort(importance1s, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2.compareTo(n1);
            }
        });
        importance1s.forEach(System.out::println);

        if (importance1s.size() <= k) {
            for (Integer i : importance1s) {
                totalLuck += i;
            }
        } else {
            int count = 0;
            for (int j : importance1s) {
                if (count < k) {
                    totalLuck += j;
                } else {
                    totalLuck -= j;
                }
                count++;
            }
        }
        for (Integer i : importance0s) {
            totalLuck += i;
        }
        return totalLuck;
    }
}
