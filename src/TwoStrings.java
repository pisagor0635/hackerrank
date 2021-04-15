import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        Set<String> strFirst = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            strFirst.add(Character.toString(s1.charAt(i)));
        }

        Set<String> strSecond = new HashSet<>();
        for (int i = 0; i < s2.length(); i++) {
            strSecond.add(Character.toString(s2.charAt(i)));
        }

        for (String s : strFirst) {
            if (strSecond.contains(s)) {
                return "YES";
            }
        }
        return "NO";
    }
}
