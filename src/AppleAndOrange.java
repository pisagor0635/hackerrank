import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {

    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apples = Arrays.asList(-2,2,1);
        List<Integer> oranges = Arrays.asList(5,-6);

        countApplesAndOranges(s,t,a,b,apples,oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        for (Integer apple : apples) {
            if ((a + apple) >= s && (a + apple) <= t) {
                appleCount++;
            }
        }
        for (Integer orange : oranges) {
            if ((b + orange) >= s && (b + orange) <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);

    }

}

