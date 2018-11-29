package com.dft.easy;

import java.util.Arrays;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int color = 0;
        int actual = ar[0];
        int counter = 1;
        for (int i = 1; i < ar.length; i++) {
            if (i == ar.length - 1) {
                if (ar[ar.length - 1] == ar[ar.length - 2]) {
                    counter++;
                    color += counter / 2;
                } else {
                    color += counter / 2;
                }
            } else if (ar[i] == actual) {
                counter++;
                actual = ar[i];
            } else if (ar[i] != actual) {
                color += counter / 2;
                actual = ar[i];
                counter = 1;
            }
        }
        return color;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 1, 2, 1, 3, 2};
        System.out.println(sockMerchant(7, tab));

        int[] tab1 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, tab1));

        int[] tab2 = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        System.out.println(sockMerchant(10, tab2));
    }

}
