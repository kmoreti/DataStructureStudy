package day4;

import java.io.*;

/**
 * Created by moreti on 1/11/17.
 */

class Date {

    /* Put your private data fields here. */
    private int day;
    private int month;
    private int year;

    /**
     * Constructs a date with the given month, day and year.   If the date is
     * not valid, the entire program will halt with an error message.
     *
     * @param month is a month, numbered in the range 1...12.
     * @param day   is between 1 and the number of days in the given month.
     * @param year  is the year in question, with no digits omitted.
     */
    public Date(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Constructs a Date object corresponding to the given string.
     *
     * @param s should be a string of the form "month/day/year" where month must
     *          be one or two digits, day must be one or two digits, and year must be
     *          between 1 and 4 digits.  If s does not match these requirements or is not
     *          a valid date, the program halts with an error message.
     */
    public Date(String s) {
        String[] date = s.split("/");

        if ((date[0].length() >= 1 && date[0].length() <= 2) &&
                (date[1].length() >= 1 && date[1].length() <= 2) &&
                (date[2].length() >= 1 && date[0].length() <= 4)) {
            if (isValidDate(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]))) {
                this.day = Integer.parseInt(date[1]);
                this.month = Integer.parseInt(date[0]);
                this.year = Integer.parseInt(date[2]);
            } else {
                System.out.println("Error: It's not a valid date!");
                System.exit(0);
            }
//            this(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
        }
    }

    /**
     * Checks whether the given year is a leap year.
     *
     * @return true if and only if the input year is a leap year.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            return !(year % 100 == 0 && year % 400 != 0);
        }
        return false;                        // replace this line with your solution
    }

    /**
     * Returns the number of days in a given month.
     *
     * @param month is a month, numbered in the range 1...12.
     * @param year  is the year in question, with no digits omitted.
     * @return the number of days in the given month.
     */
    public static int daysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                }
                return 28;
            default:
                return 30;
        }
    }

    /**
     * Checks whether the given date is valid.
     *
     * @return true if and only if month/day/year constitute a valid date.
     * <p>
     * Years prior to A.D. 1 are NOT valid.
     */
    public static boolean isValidDate(int month, int day, int year) {
        return !((month < 1 || month > 12) || (year < 1) || (day > daysInMonth(month, year) || day < 1));
    }

    /**
     * Returns a string representation of this date in the form month/day/year.
     * The month, day, and year are expressed in full as integers; for example,
     * 12/7/2006 or 3/21/407.
     *
     * @return a String representation of this date.
     */
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    /**
     * Determines whether this Date is before the Date d.
     *
     * @return true if and only if this Date is before d.
     */
    public boolean isBefore(Date d) {
        if (year < d.year) {
            return true;
        }
        if (year == d.year && month < d.month) {
            return true;
        }
        if (year == d.year && month == d.month && day < d.day) {
            return true;
        }
        return false;                        // replace this line with your solution
    }

    /**
     * Determines whether this Date is after the Date d.
     *
     * @return true if and only if this Date is after d.
     */
    public boolean isAfter(Date d) {
        return (!isBefore(d) && (day != d.day || month != d.month || year != d.year));
    }

    /**
     * Returns the number of this Date in the year.
     *
     * @return a number n in the range 1...366, inclusive, such that this Date
     * is the nth day of its year.  (366 is used only for December 31 in a leap
     * year.)
     */
    public int dayInYear() {
        int nth = day;
        for (int m = 1; m < month; m++) {
            nth += daysInMonth(m, this.year);
        }
        return nth;
    }

    /**
     * Determines the difference in days between d and this Date.  For example,
     * if this Date is 12/15/2012 and d is 12/14/2012, the difference is 1.
     * If this Date occurs before d, the result is negative.
     *
     * @return the difference in days between d and this date.
     */
    public int difference(Date d) {
        int sum = 0;
        int iniYear = 0;
        int endYear = 0;
        int dInYear = 0;
        int plusDays = 0;
        int factor = 1;

        if (isAfter(d)) {
            iniYear = d.year;
            endYear = year;
            dInYear = d.dayInYear();
            plusDays = dayInYear();
        } else if (isBefore(d)) {
            iniYear = year;
            endYear = d.year;
            dInYear = dayInYear();
            plusDays = d.dayInYear();
            factor = -1;
        }
        else {
            return 0;
        }

        for (int y = iniYear; y < endYear; y++) {
            if (y == iniYear) {
                if (isLeapYear(y)) {
                    sum += 366 - dInYear;
                } else {
                    sum += 365 - dInYear;
                }
            } else {
                if (isLeapYear(y)) {
                    sum += 366;
                } else {
                    sum += 365;
                }
            }
        }

        sum = (sum + plusDays) * factor;

        return sum;
    }

    public static void main(String[] argv) {
        System.out.println("\nTesting constructors.");
        Date d1 = new Date(1, 1, 1);
        System.out.println("Date should be 1/1/1: " + d1);
        d1 = new Date("2/4/2");
        System.out.println("Date should be 2/4/2: " + d1);
        d1 = new Date("2/29/2000");
        System.out.println("Date should be 2/29/2000: " + d1);
        d1 = new Date("2/29/1904");
        System.out.println("Date should be 2/29/1904: " + d1);

        d1 = new Date(12, 31, 1975);
        System.out.println("Date should be 12/31/1975: " + d1);
        Date d2 = new Date("1/1/1976");
        System.out.println("Date should be 1/1/1976: " + d2);
        Date d3 = new Date("1/2/1976");
        System.out.println("Date should be 1/2/1976: " + d3);

        Date d4 = new Date("2/27/1977");
        Date d5 = new Date("8/31/2110");

    /* I recommend you write code to test the isLeapYear function! */

        System.out.println("\nTesting before and after.");
        System.out.println(d2 + " after " + d1 + " should be true: " +
                d2.isAfter(d1));
        System.out.println(d3 + " after " + d2 + " should be true: " +
                d3.isAfter(d2));
        System.out.println(d1 + " after " + d1 + " should be false: " +
                d1.isAfter(d1));
        System.out.println(d1 + " after " + d2 + " should be false: " +
                d1.isAfter(d2));
        System.out.println(d2 + " after " + d3 + " should be false: " +
                d2.isAfter(d3));

        System.out.println(d1 + " before " + d2 + " should be true: " +
                d1.isBefore(d2));
        System.out.println(d2 + " before " + d3 + " should be true: " +
                d2.isBefore(d3));
        System.out.println(d1 + " before " + d1 + " should be false: " +
                d1.isBefore(d1));
        System.out.println(d2 + " before " + d1 + " should be false: " +
                d2.isBefore(d1));
        System.out.println(d3 + " before " + d2 + " should be false: " +
                d3.isBefore(d2));

        System.out.println("\nTesting difference.");
        System.out.println(d1 + " - " + d1 + " should be 0: " +
                d1.difference(d1));
        System.out.println(d2 + " - " + d1 + " should be 1: " +
                d2.difference(d1));
        System.out.println(d3 + " - " + d1 + " should be 2: " +
                d3.difference(d1));
        System.out.println(d3 + " - " + d4 + " should be -422: " +
                d3.difference(d4));
        System.out.println(d5 + " - " + d4 + " should be 48762: " +
                d5.difference(d4));
    }
}
