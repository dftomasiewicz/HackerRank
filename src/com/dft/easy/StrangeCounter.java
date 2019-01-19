package com.dft.easy;

public class StrangeCounter {

    static long strangeCounter(long t) {
        long initValue = 3;
        while (t > initValue) {
            t -= initValue;
            initValue *= 2;
        }
        return (initValue - t + 1);
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(0));
        System.out.println(strangeCounter(2));
        System.out.println(strangeCounter(7));
        System.out.println(strangeCounter(14));
        System.out.println(strangeCounter(22));
    }

}
