package com.dft.java.easyTasks;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class JavaDateAndTime {

    public static String findDay(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(year, month - 1, day);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.ENGLISH);
    }

    public static void main(String[] args) {
        System.out.println(findDay(02, 15, 2019));
    }
}
