package com.dft.easy;

public class MinimumDistances {

    static int minimumDistances(int[] a) {
        int counter = Integer.MAX_VALUE;

        for (int i = a.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (a[i] == a[j] && i - j < counter) {
                    counter = i - j;
                    break;
                }
            }
        }

        if(counter < Integer.MAX_VALUE){
            return counter;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(minimumDistances(new int[] {3,2,1,2,3}));
        System.out.println(minimumDistances(new int[] {7,1,3,4,1,7}));
        System.out.println(minimumDistances(new int[] {1,1}));

    }
}
