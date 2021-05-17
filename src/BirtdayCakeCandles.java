import java.util.Collections;
import java.util.List;

public class BirtdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {

        Collections.sort(candles);
        int max = candles.get(candles.size()-1);
        return (int)candles.stream().filter(t->t.equals(max)).count();

    }

}
