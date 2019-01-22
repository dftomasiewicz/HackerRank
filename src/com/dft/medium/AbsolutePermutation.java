package com.dft.medium;

import java.util.Arrays;

public class AbsolutePermutation {

    static int[] absolutePermutation(int n, int k) {
        int[] nArray = new int[n];
        int d = 1;
        for (int i = 0, j = 0; i < n; i++, j++) {
            if (j == k) {
                d *= -1;
                j = 0;
            }

            int value = i + 1 + k * d;
            if (value < 1 || value > n)
                return new int[]{-1};
            nArray[i] = value;
        }
        return nArray;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(absolutePermutation(4, 2)));
        System.out.println(Arrays.toString(absolutePermutation(2, 1)));
        System.out.println(Arrays.toString(absolutePermutation(3, 0)));
        System.out.println(Arrays.toString(absolutePermutation(3, 2)));
        System.out.println(Arrays.toString(absolutePermutation(10, 5)));
        System.out.println(Arrays.toString(absolutePermutation(7, 5)));
        System.out.println(Arrays.toString(absolutePermutation(100, 2)));
    }
}
