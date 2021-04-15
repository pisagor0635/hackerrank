import java.util.LinkedList;
import java.util.List;

public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        int count = 0;
        List<String> s1 = new LinkedList<>();
        for (int i = 0; i < a.length(); i++) {
            s1.add(Character.toString(a.charAt(i)));
        }

        List<String> s2 = new LinkedList<>();
        for (int i = 0; i < b.length(); i++) {
            s2.add(Character.toString(b.charAt(i)));
        }

        for (String s : s1) {
            if (s2.contains(s)) {
                s2.remove(s);

            } else {
                count++;
            }
        }
        if (s2.size() > 0) {
            count += s2.size();
        }

        return count;

    }

}
