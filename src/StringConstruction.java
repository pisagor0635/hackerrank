import java.util.*;
public class StringConstruction {

    public static void main(String[] args) {
        //test
        System.out.println(stringConstruction("abcd"));
    }

    static int stringConstruction(String s) {
        String[] letters = s.split("");
        Set<String> distinctLetters = new HashSet<>();
        distinctLetters.addAll(Arrays.asList(letters));
        return distinctLetters.size();
    }
}


