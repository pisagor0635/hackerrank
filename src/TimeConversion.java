public class TimeConversion {

    public static void main(String[] args) {

        String time = "12:05:45AM";
        System.out.println(timeConversion(time));

    }

    public static String timeConversion(String s) {

        String converted = "";
        String key = s.substring(s.length() - 2);
        String[] values = s.substring(0, s.length() - 2).split(":");
        if (key.equals("PM")) {
            if (values[0].equals("12")) {
                converted = values[0] + ":" + values[1] + ":" + values[2];
            } else {
                converted = (Integer.parseInt(values[0]) + 12) + ":" + values[1] + ":" + values[2];
            }
        } else if (key.equals("AM")) {
            if (values[0].equals("12")) {
                converted = "00" + ":" + values[1] + ":" + values[2];
            } else {
                converted = values[0] + ":" + values[1] + ":" + values[2];
            }
        }

        return converted;


    }

}
