public class MinimumHeightTriangle {

    public static void main(String[] args) {
        System.out.println(lowestTriangle(10, 100));
    }

    public static int lowestTriangle(int trianglebase, int area) {

        if ((2 * area) / trianglebase == (double) (2 * area) / trianglebase) {
            return (2 * area) / trianglebase;
        } else {
            return ((2 * area) / trianglebase) + 1;
        }

    }

}
