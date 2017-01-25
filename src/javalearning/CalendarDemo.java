package javalearning;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

    public static void main(String[] args) {

        String month = "08";
        String day = "05";
        String year = "2015";

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, Integer.parseInt(year));
        c.set(Calendar.MONTH, Integer.parseInt(month) - 1);
        c.set(Calendar.DATE, Integer.parseInt(day));

        System.out.println(new SimpleDateFormat("EEEE").format(c.getTime()).toUpperCase());
    }
}
