package com.dft.easy;

public class TaumAndBday {

    static long taumBday(int b, int w, int bc, int wc, int z) {
        long bl = b;
        long wl = w;
        long bcl = bc;
        long wcl = wc;
        long zl = z;
        long cost = bl * bcl + wl * wcl;
        if (bcl < wcl && cost > (bl + wl) * bcl + wl * zl) {
            cost = (bl + wl) * bcl + wl * zl;
        } else if (wcl < bcl && cost > (bl + wl) * wcl + bl * zl) {
            cost = (bl + wl) * wcl + bl * zl;
        }
        return cost;
    }

    public static void main(String[] args) {
        System.out.println(taumBday(10, 10, 1, 1, 1));
        System.out.println(taumBday(5, 9, 2, 3, 4));
        System.out.println(taumBday(3, 6, 9, 1, 1));
        System.out.println(taumBday(7, 7, 4, 2, 1));
        System.out.println(taumBday(3, 3, 1, 9, 2));
        System.out.println(taumBday(27984, 1402, 619246, 615589, 247954));
        System.out.println(taumBday(443463982,833847400,429734889,628664883,610875522));
    }
}
