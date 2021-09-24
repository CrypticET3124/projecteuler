import java.util.Calendar;

public class b19 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int s = 0;

        for (int yr = 1901; yr <= 2000; yr++) {
            cal.set(Calendar.YEAR, yr);
            for (int m = 1; m <= 12; m++) {
                cal.set(Calendar.MONTH, m);
                cal.set(Calendar.DAY_OF_MONTH, 1);
                // if (cal.get(Calendar.DAY_OF_WEEK) == 1)

                // if ((new DateTime(year, month, 1)).DayOfWeek == DayOfWeek.Sunday) {
            }
        }
        System.out.println(s);
    }
}
/*
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday.
 * 
 * Thirty days has September,
 * 
 * April, June and November.
 * 
 * All the rest have thirty-one,
 * 
 * Saving February alone,
 * 
 * Which has twenty-eight, rain or shine.
 * 
 * And on leap years, twenty-nine.
 * 
 * A leap year occurs on any year evenly divisible by 4, but not on a century
 * unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 */