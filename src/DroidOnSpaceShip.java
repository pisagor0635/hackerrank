public class DroidOnSpaceShip {
    static int xPos = 11;
    static int yPos = 7;

    public static void main(String[] args) {
        //String[] command = {"[so,1]", "[we,7]", "[so,1]", "[ea,2]"};
        String lastPosition = walk("[so,12]");

        System.out.println(lastPosition);
    }


    public static String walk(String walkCommandString) {

        int lowerBoundary = 0;
        int upperBoundary = 8;
        int rightBoundary = 12;
        int leftBoundary = 0;


        String direction = walkCommandString.split(",")[0].substring(1, 3);
        int stepSize = Integer.parseInt(walkCommandString.split(",")[1].substring(0, 1));

        System.out.println(direction);
        System.out.println(stepSize);

        switch (direction) {
            case "no": {
                for (int i = 0; i < stepSize; i++) {
                    yPos++;
                    if (yPos == upperBoundary) {
                        break;
                    }
                    //obstacle
                    if (yPos == 5 && xPos == 5) {
                        yPos--;
                        break;
                    }
                    if (yPos == 6 && (xPos >= 5 && xPos <= 11)) {
                        yPos--;
                        break;
                    }
                }
            }
            break;
            case "so": {
                for (int i = 0; i < stepSize; i++) {
                    yPos--;
                    if (yPos == lowerBoundary) {
                        break;
                    }
                    //obstacle
                    if (yPos == 6 && (xPos >= 5 && xPos <= 11)) {
                        break;
                    }
                    if (yPos == 4 && xPos == 5) {
                        break;
                    }

                }
            }
            break;
            case "ea": {
                for (int i = 0; i < stepSize; i++) {
                    xPos++;
                    if (xPos == rightBoundary) {
                        xPos--;
                        break;
                    }
                    //obstacle
                    if (xPos == 5 && yPos == 5) {
                        xPos--;
                        break;
                    }
                    if (xPos == 6 && (yPos >= 2 && yPos <= 4)) {
                        xPos--;
                        break;
                    }
                }
            }
            break;
            case "we": {
                for (int i = 0; i < stepSize; i++) {
                    xPos--;
                    if (xPos == leftBoundary) {
                        break;
                    }
                    //obstacle
                    if (xPos == 6 && yPos == 5) {
                        break;
                    }
                    if (xPos == 7 && (yPos >= 2 && yPos <= 4)) {
                        break;
                    }
                }
            }
            break;
            default:
                System.out.println("Invalid command");
        }

        String lastPosition = "(" + xPos + "," + yPos + ")";

        System.out.println(lastPosition);

        return lastPosition;

    }
}
