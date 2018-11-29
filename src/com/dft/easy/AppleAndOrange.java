package com.dft.easy;

import java.util.Scanner;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int[] fallenApples = new int[apples.length];
        int[] fallenOranges = new int[oranges.length];
        int appelsCounter = 0;
        int orangesCounter = 0;
        for(int i = 0; i < apples.length; i++){
            fallenApples[i] = a + apples[i];
            if (fallenApples[i] >= s && fallenApples[i] <= t){
                appelsCounter++;
            }
        }
        for(int i = 0; i < oranges.length; i++){
            fallenOranges[i] = b + oranges[i];
            if (fallenOranges[i] >= s && fallenOranges[i] <= t){
                orangesCounter++;
            }
        }
        System.out.println(appelsCounter);
        System.out.print(orangesCounter);
    }

    public static void main(String[] args) {
        int[] applesTab = {-2,2,1};
        int[] orangesTab = {5,-6};

        countApplesAndOranges(7,11,5,15,applesTab,orangesTab);
    }

}

