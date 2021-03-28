import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Long> wordsMagazine = Arrays.stream(magazine).collect(groupingBy(Function.identity(), counting()));
        Map<String, Long> wordsNote = Arrays.stream(note).collect(groupingBy(Function.identity(), counting()));
        Set<String> words = wordsNote.keySet();
        for (String s : words) {
            if(wordsMagazine.containsKey(s)){
                if (wordsNote.get(s) > wordsMagazine.get(s)) {
                    System.out.println("No");
                    return;
                }
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
