package com.dft.easy;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if ((x2 > x1 && v2 > v1) || (x2 < x1 && v2 < v1)) {
            return "NO";
        }

        if (v1 > v2) {
            while (x1 <= x2) {
//                System.out.println(x1 + " "+ x2);
                x1 += v1;
                x2 += v2;
                if (x1 == x2) {
                    return "YES";
                }
            }
        } else {
            while (x1 >= x2) {
//                System.out.println(x1 + " "+ x2);
                x1 += v1;
                x2 += v2;
                if (x1 == x2) {
                    return "YES";
                }
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(0,3,4,2));
        System.out.println(kangaroo(0,2,5,3));
        System.out.println(kangaroo(4523,8092,9419,8076));
        System.out.println(kangaroo(21,6,47,3));
        System.out.println(kangaroo(47, 3, 21, 6));
    }

}
