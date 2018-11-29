package com.dft.easy;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {
        int coutner = 0;
        int currentIndex = 0;
        while (currentIndex < c.length - 1) {
            if (currentIndex == c.length - 2) {
                currentIndex++;
                coutner++;
                break;
            }
            if (c[currentIndex + 2] == 0) {
                currentIndex += 2;
                coutner++;
            } else {
                currentIndex += 1;
                coutner++;
            }
        }
        return coutner;
    }

    static int jumpingOnClouds2(int[] c) {
        int counter = -1;
        for (int i = 0; i < c.length; i++, counter++) {
            if (i < c.length - 2 && c[i + 2] == 0) {
                i++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 1, 0, 0, 0, 1, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 0, 1, 0, 0}));
    }
}
