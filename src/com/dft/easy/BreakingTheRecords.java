package com.dft.easy;

import java.util.Arrays;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores[0];
        int[] result = new int[2];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                result[0] += 1;
            }
            if (scores[i] < min) {
                min = scores[i];
                result[1] += 1;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] tab1 = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        int[] tab2 = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        System.out.println(Arrays.toString(breakingRecords(tab1)));
        System.out.println(Arrays.toString(breakingRecords(tab2)));

    }
}
