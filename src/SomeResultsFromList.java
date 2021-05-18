import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class SomeResultsFromList {
    public static void main(String[] args) {
        int[] list = {5, 2, 5, 5, 6, 6, 10, 12, 12};
        System.out.print("Original List : ");
        Arrays.stream(list).forEach(s -> System.out.print(" " + s));

        //distinct list
        printDistinctElements(list);

        //number of duplicated elements
        countDuplicates(list);

        //max value of duplicated
        //min value of duplicated
        findMinMaxDuplicated(list);

    }

    private static void printDistinctElements(int[] list) {
        System.out.print("\nDistinct List : ");
        Arrays.stream(list).sorted().distinct().forEach(e -> System.out.print(e + " "));

    }

    private static void countDuplicates(int[] list) {
        Map<Integer, Long> collect = Arrays.stream(list).boxed().collect(groupingBy(Function.identity(), counting()));
        System.out.println("\nNumber of duplicates : " + collect.values().stream().filter(s -> s > 1).count());
    }

    private static void findMinMaxDuplicated(int[] list) {

        Map<Integer, Long> collect = Arrays.stream(list).boxed().collect(groupingBy(Function.identity(), counting()));
        List<Long> duplicatedValues = collect.values().stream().filter(s -> s > 1).collect(Collectors.toList());

        Set<Integer> duplicatedKeys = new HashSet<>();

        for (Integer key : collect.keySet()) {
            for (Long value : duplicatedValues) {

                if (collect.get(key) == value) {
                    duplicatedKeys.add(key);
                }
            }
        }
        List<Integer> sortedSetKeys = new ArrayList<>(duplicatedKeys);
        Collections.sort(sortedSetKeys);
        if (duplicatedKeys.size() > 1) {
            System.out.println("Min Duplicated = " + sortedSetKeys.get(0));
            System.out.println("Max Duplicated = " + sortedSetKeys.get(sortedSetKeys.size() - 1));
        } else {
            System.out.println("There exist unique duplicates : " + sortedSetKeys.get(0));
        }

    }


}
