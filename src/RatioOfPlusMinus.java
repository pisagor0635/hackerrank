import java.util.List;

public class RatioOfPlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int numberOfPlus = 0;
        int numberOfMinus = 0;
        int numberOfZero = 0;
        int numberOfElements = arr.size();
        for (Integer num : arr) {
            if (num > 0) {
                numberOfPlus++;
            } else if (num < 0) {
                numberOfMinus++;
            } else {
                numberOfZero++;
            }
        }
        System.out.println((double)numberOfPlus/numberOfElements);
        System.out.println((double)numberOfMinus/numberOfElements);
        System.out.println((double)numberOfZero/numberOfElements);
    }

}
