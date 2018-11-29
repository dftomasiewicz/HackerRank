package com.dft.easy;

public class LibraryFine {

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if (y1 < y2) {
            return 0;
        } else if (y1 > y2) {
            return 10000;
        } else if (m1 < m2) {
            return 0;
        } else if (m1 > m2) {
            return (m1 - m2) * 500;
        } else if (d1 > d2) {
            return (d1 - d2) * 15;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(libraryFine(9, 6, 2015, 6, 6, 2015));
        System.out.println(libraryFine(2, 7, 1014, 1, 1, 1015));
        System.out.println(libraryFine(28, 2, 2015, 15, 4, 2015));
    }
}
