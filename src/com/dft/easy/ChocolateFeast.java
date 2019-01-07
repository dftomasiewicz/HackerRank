package com.dft.easy;

public class ChocolateFeast {

    static int chocolateFeast(int n, int c, int m) {
        int initialBars = n / c;
        int wrappers = initialBars;
        int extraBars = 0;

        while (wrappers >= m) {
            extraBars = wrappers / m;
            wrappers = wrappers % m;
            wrappers += extraBars;
            initialBars += extraBars;
        }

        return initialBars;
    }

    public static void main(String[] args) {
        System.out.println(chocolateFeast(15, 3, 2));
        System.out.println(chocolateFeast(10,2,5));
        System.out.println(chocolateFeast(12,4,4));
        System.out.println(chocolateFeast(6,2,2));

    }
}
