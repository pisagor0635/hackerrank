public class TimeConversion {

    public static void main(String[] args) {
        String time = "1:05:45PM";
        System.out.println(timeConversion(time));
    }

    public static String timeConversion(String s) {
        StringBuilder converted = new StringBuilder();
        String key = s.substring(s.length() - 2);
        String[] values = s.substring(0, s.length() - 2).split(":");
        if (key.equals("PM")) {
            if (values[0].equals("12")) {
                converted.append(values[0]).append(":").append(values[1]).append(":").append(values[2]);
            } else {
                converted.append(Integer.parseInt(values[0]) + 12).append(":").append(values[1]).append(":").append(values[2]);
            }
        } else if (key.equals("AM")) {
            if (values[0].equals("12")) {
                converted.append("00").append(":").append(values[1]).append(":").append(values[2]);
            } else {
                converted.append(values[0]).append(":").append(values[1]).append(":").append(values[2]);
            }
        }
        return converted.toString();
    }
}
