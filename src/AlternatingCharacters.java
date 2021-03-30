public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int repeated = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                repeated++;
            }
        }

        return repeated;
    }
}
