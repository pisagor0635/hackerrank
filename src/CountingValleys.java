public class CountingValleys {
    public static void main(String[] args) {

        String testPath = "UDDDUDUU";
        int numberOfSteps = 8;

        System.out.println(countingValleys(numberOfSteps, testPath));

    }

    public static int countingValleys(int steps, String path) {
        if (steps < 2 || steps > Math.pow(10, 6)) {
            System.out.println("more steps than allowed");
            return 0;
        }
        int count = 0;
        int control = 0;
        int numberOfValleyTraversed = 0;
        for (int i = 0; i < path.length(); i++) {
            control = count;
            if (path.charAt(i) == 'U') {
                count++;
            } else if (path.charAt(i) == 'D') {
                count--;
            } else {
                System.out.println("in correct move");
                return 0;
            }
            if (count == 0 && control < 0) {
                numberOfValleyTraversed++;
            }
        }
        return numberOfValleyTraversed;
    }
}