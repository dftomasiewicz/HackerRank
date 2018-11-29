package com.dft.easy;

public class ElectronicsShop {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] > max && keyboards[i] + drives[j] <= b) {
                    max = keyboards[i] + drives[j];
                }
            }
        }
        if (max != 0) {
            return max;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getMoneySpent(new int[]{3, 1}, new int[]{5, 2, 8}, 10));
        System.out.println(getMoneySpent(new int[]{4}, new int[]{5}, 5));
    }
}
