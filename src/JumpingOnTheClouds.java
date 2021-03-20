public class JumpingOnTheClouds {

    public static void main(String[] args) {
        //int[] clouds = {0, 0, 0, 0, 1, 0};
        int[] clouds = {0,0,0,1,0,0};
        System.out.println(jumpingOnClouds(clouds));

    }


    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int i;
        for (i = 1; i < c.length - 1; i++) {
            if (c[i + 1] == 0) {
                count++;
                i++;
            } else {
                count++;
            }
        }
        //If we reached the penultimate position in the last step
        if (i == c.length - 1) {
            count++;
        }

        return count;
    }
}
