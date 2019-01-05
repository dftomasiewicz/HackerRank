package com.dft.medium;

import java.util.HashMap;
import java.util.Map;

public class TheTimeInWords {

    static String timeInWords(int h, int m) {

        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(0, "zero");
        numberMap.put(1, "one");
        numberMap.put(2, "two");
        numberMap.put(3, "three");
        numberMap.put(4, "four");
        numberMap.put(5, "five");
        numberMap.put(6, "six");
        numberMap.put(7, "seven");
        numberMap.put(8, "eight");
        numberMap.put(9, "nine");
        numberMap.put(10, "ten");
        numberMap.put(11, "eleven");
        numberMap.put(12, "twelve");
        numberMap.put(13, "thirteen");
        numberMap.put(14, "fourteen");
        numberMap.put(15, "quarter");
        numberMap.put(16, "sixteen");
        numberMap.put(17, "seventeen");
        numberMap.put(18, "eighteen");
        numberMap.put(19, "nineteen");
        numberMap.put(20, "twenty");
        numberMap.put(21, "twenty one");
        numberMap.put(22, "twenty two");
        numberMap.put(23, "twenty three");
        numberMap.put(24, "twenty four");
        numberMap.put(25, "twenty five");
        numberMap.put(26, "twenty six");
        numberMap.put(27, "twenty seven");
        numberMap.put(28, "twenty eight");
        numberMap.put(29, "twenty nine");
        numberMap.put(30, "half");

        String time;

        if (m == 0) {
            time = numberMap.get(h) + " o' clock";
        } else if (m == 1) {
            time = numberMap.get(m) + " minute past " + numberMap.get(h);
        } else if (m == 15 || m == 30) {
            time = numberMap.get(m) + " past " + numberMap.get(h);
        } else if (m == 45) {
            if (h != 23) {
                time = numberMap.get(15) + " to " + numberMap.get(h + 1);
            } else {
                time = numberMap.get(15) + " to " + numberMap.get(0);
            }
        } else if (m == 59) {
            if (h != 23) {
                time = numberMap.get(1) + " minute to " + numberMap.get(h + 1);
            } else {
                time = numberMap.get(1) + " minute to " + numberMap.get(0);
            }
        } else if (m < 30) {
            time = numberMap.get(m) + " minutes past " + numberMap.get(h);
        } else {
            time = numberMap.get(60 - m) + " minutes to " + numberMap.get(h + 1);
        }

        return time;
    }

    public static void main(String[] args) {
        System.out.println(timeInWords(5, 45));
        System.out.println(timeInWords(5, 47));
        System.out.println(timeInWords(3, 00));
        System.out.println(timeInWords(7, 15));
        System.out.println(timeInWords(23, 00));
        System.out.println(timeInWords(23, 59));

    }
}
