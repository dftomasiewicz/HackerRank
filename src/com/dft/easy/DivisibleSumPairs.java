package com.dft.easy;

public class DivisibleSumPairs {

    static int divisibleSumPairs(int n, int k, int[] ar) {
        int counter = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6};
        System.out.println(divisibleSumPairs(6,5, ar));

        int[] ar1 = {1,3,2,6,1,2};
        System.out.println(divisibleSumPairs(6,3, ar));

    }
}
