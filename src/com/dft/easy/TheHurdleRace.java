package com.dft.easy;

import java.util.Arrays;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        Arrays.sort(height);
        if(height[height.length-1] - k > 0){
            return height[height.length-1] - k;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(hurdleRace(1, new int[] {1,2,3,3,2}));
        System.out.println(hurdleRace(4, new int[] {1,6,3,5,2}));
        System.out.println(hurdleRace(7, new int[] {2,5,4,5,2}));
    }
}
