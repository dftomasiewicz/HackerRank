package com.dft.easy;

public class JumpingOnTheCloudsRevisited {

    static int jumpingOnClouds(int[] c, int k) {
        int e = 100;
        for (int i = 0; i < c.length; i += k) {
            if (c[i] == 0) {
                e--;
            } else {
                e -= 3;
            }
        }
            return e;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 0, 1, 1, 0, 0, 0, 0}, 3));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1));
        System.out.println(jumpingOnClouds(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1}, 19));
    }
}
