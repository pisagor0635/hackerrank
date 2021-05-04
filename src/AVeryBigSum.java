import java.util.ArrayList;
import java.util.List;

public class AVeryBigSum {

    public static void main(String[] args) {

        List<Long> numbers = new ArrayList<>();
        numbers.add(1000000001L);
        numbers.add(1000000002L);
        numbers.add(1000000003L);
        numbers.add(1000000004L);
        numbers.add(1000000005L);

        System.out.println(aVeryBigSum(numbers));
    }

    public static long aVeryBigSum(List<Long> ar) {
        Long sum = 0L;
        for (Long l : ar) {
            sum += l;
        }
        return sum;
    }
}
