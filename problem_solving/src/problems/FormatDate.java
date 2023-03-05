package problems;

import java.util.HashMap;
import java.util.Map;

public class FormatDate {

    static Map<String, String> months = new HashMap<>();

    static {
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
    }

    public static String formatDate(String date) {
        // 1993-07-12
        String dts[] = date.split(" ");
        String day = Character.isDigit(dts[0].charAt(1)) ? (dts[0].charAt(0) + "" + dts[0].charAt(1))
                : ("0" + dts[0].charAt(0));
        return  dts[2] + "-" + months.get(dts[1]) + "-" + day;
    }

}
