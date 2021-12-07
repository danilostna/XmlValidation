package main.java.hackerrank;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;

public class PrintDayOfWeek {

    public static void main(String[] args) {
        System.out.println(findDay(11, 21, 2021));
        System.out.println(findDay(11, 22, 2021));
        System.out.println(findDay(11, 23, 2021));
        System.out.println(findDay(11, 24, 2021));
        System.out.println(findDay(11, 25, 2021));
        System.out.println(findDay(11, 26, 2021));
        System.out.println(findDay(11, 27, 2021));
    }

    public static String findDay(int month, int day, int year) {
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.MONTH, month-1);
        instance.set(Calendar.DAY_OF_MONTH, day);
        instance.set(Calendar.YEAR, year);

        switch (instance.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                return "SUNDAY";
            case 2:
                return "MONDAY";
            case 3:
                return "TUESDAY";
            case 4:
                return "WEDNESDAY";
            case 5:
                return "THURSDAY";
            case 6:
                return "FRIDAY";
            default:
                return "SATURDAY";
        }
    }
}
