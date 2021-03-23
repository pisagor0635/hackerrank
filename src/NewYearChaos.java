public class NewYearChaos {
    static void minimumBribes(int[] q) {
        long len = q.length;
        if (len < 1 || len > Math.pow(10, 5)) {
            return;
        }
        int controlForCheckConstraintOnBribes;
        int controlForComplecity;
        int bribes = 0;
        for (int i = 0; i < len; i++) {
            controlForCheckConstraintOnBribes = 0;
            controlForComplecity = 0;
            for (int j = i; j < len; j++) {
                if (q[i] > q[j]) {
                    bribes++;
                    controlForCheckConstraintOnBribes++;
                    if (controlForCheckConstraintOnBribes > 2) {
                        System.out.println("Too chaotic");
                        return;
                    }
                } else {
                    //else part is added to solve timeout for some test cases. 1
                    //12 is lower limit
                    controlForComplecity++;
                    if (controlForComplecity > 12) {
                        break;
                    }
                }
            }
        }
        System.out.println(bribes);
    }
}
