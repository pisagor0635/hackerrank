import java.math.BigInteger;
import java.util.List;

public class ConnectingTowns {
    public static int connectingTowns(int n, List<Integer> routes) {
        BigInteger numberOfWay = BigInteger.ONE ;
        for (int i = 0; i < routes.size(); i++) {
            numberOfWay = numberOfWay.multiply(BigInteger.valueOf(routes.get(i)));
        }
        numberOfWay = numberOfWay.mod(BigInteger.valueOf(1234567));
        return numberOfWay.intValue();
    }
}
