import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class OccurencesUniqueNumberOfTimes {

    public static void main(String[] args) {
//        int numberOfDeleted = occurencesUniqueNumberOfTimes("aaaabbbb");
//        int numberOfDeleted = occurencesUniqueNumberOfTimes("ccaaffddecee");
//        int numberOfDeleted = occurencesUniqueNumberOfTimes("eeee");
        int numberOfDeleted = occurencesUniqueNumberOfTimes("example");
        System.out.println(numberOfDeleted);
    }

    private static int occurencesUniqueNumberOfTimes(String s) {
        int countDeleted = 0;
        List<Long> uniqueNumberOfOccurences = new ArrayList<>();
        String[] letters = s.split("");

        Map<String, Long> frequenceOfEachLetter = Arrays.asList(letters).stream().collect(groupingBy(Function.identity(), counting()));

        List<Long> values = frequenceOfEachLetter.values().stream().collect(Collectors.toList());

        for (Long l : values) {
            while (true) {
                if (!uniqueNumberOfOccurences.contains(l)) {
                    uniqueNumberOfOccurences.add(l);
                    break;
                } else {
                    l--;
                    countDeleted++;
                    if (l == 0) {
                        break;
                    }
                }
            }
        }
        return countDeleted;
    }
}
