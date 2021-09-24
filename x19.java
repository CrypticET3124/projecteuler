public class x19 {
    public static void main(String[] args) {
        int D = 3; // sun = 1, sat = 7
        int s = 0;

        for (int yr = 1901; yr <= 2000; yr++) {
            for (int m = 1; m <= 12; m++) {
                int d = 1;

                if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) { // jan, mar, may, jul, aug,
                                                                                            // oct, dec
                    while (d <= 31) {
                        if (D == 8) {
                            D = 1;
                        }
                        if (D == 1 && d == 1) {
                            s++;
                        }
                        D++;
                        d++;
                    }
                } else if (m == 4 || m == 6 || m == 9 || m == 11) { // apr, jun, sep, nov
                    while (d <= 30) {
                        if (D == 8) {
                            D = 1;
                        }
                        if (D == 1 && d == 1) {
                            s++;
                        }
                        D++;
                        d++;
                    }
                } else { // feb
                    if (yr % 400 == 0) {
                        while (d <= 29) {
                            if (D == 8) {
                                D = 1;
                            }
                            if (D == 1 && d == 1) {
                                s++;
                            }
                            D++;
                            d++;
                        }
                    } else {
                        while (d <= 28) {
                            if (D == 8) {
                                D = 1;
                            }
                            if (D == 1 && d == 1) {
                                s++;
                            }
                            D++;
                            d++;
                        }
                    }
                }
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