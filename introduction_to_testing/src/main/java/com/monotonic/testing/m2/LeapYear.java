package com.monotonic.testing.m2;

public class LeapYear {

    public static boolean isLeapYear(final int year) {
        return isDivisible(year, 4) && !(year % 100 == 0) || isDivisible(year, 400);
    }

    private static boolean isDivisible(final int year, final int denominator) {
        return year % denominator == 0;
    }
}
