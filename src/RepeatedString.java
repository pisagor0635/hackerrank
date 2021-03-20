public class RepeatedString {
    public static void main(String[] args) {
        String word = "a";
        long totalLength = 1000000000000L;

        System.out.println(repeatedString(word, totalLength));


    }

    static long repeatedString(String s, Long n) {
        int lengthOfString = s.length();
        if (lengthOfString < 1 || lengthOfString > 100) {
            System.out.println("Irregular length!");
            return 0;
        }
        if (n < 1 && n > Math.pow(10, 12)) {
            System.out.println("Total length is not suitable!");
            return 0;
        }
        long lengthOfRemainingPart = n % lengthOfString;
        long numberOfAsInString = 0;
        long numberOfAsInRemainingPart = 0;

        for (int i = 0; i < lengthOfString; i++) {
            if (s.charAt(i) == 'a') {
                numberOfAsInString++;
            }
        }
        for (int i = 0; i < lengthOfRemainingPart; i++) {
            if (s.charAt(i) == 'a') {
                numberOfAsInRemainingPart++;
            }
        }
        return numberOfAsInString * (n / lengthOfString) + numberOfAsInRemainingPart;
    }
}
