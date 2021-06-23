public class BiggestTwoDigit {

    public static void main(String[] args) {
//        int biggestTwoDigit = biggestTwoDigit("50552");
//        int biggestTwoDigit = biggestTwoDigit("10101");
        int biggestTwoDigit = biggestTwoDigit("88");
        System.out.println(biggestTwoDigit);
    }


    private static int biggestTwoDigit(String number) {
        int max = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            if (Integer.parseInt(number.substring(i, i + 2)) > max) {
                max = Integer.parseInt(number.substring(i, i + 2));
            }
        }
        return max;
    }
}
