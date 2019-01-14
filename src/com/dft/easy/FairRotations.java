package com.dft.easy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class FairRotations {

    static void fairRations(int[] B) {
        int sum = 0;
        for (int i : B) {
            sum += i;
        }

        if (sum % 2 != 0) {
            System.out.println("NO");
        } else {
            int counter = 0;
            for (int i = 0; i < B.length; i++) {
                if (B[i] % 2 != 0) {
                    B[i] = B[i] + 1;
                    B[i + 1] = B[i + 1] + 1;
                    counter += 2;
                }
            }
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        fairRations(new int[]{4, 5, 6, 7});
        fairRations(new int[]{2, 3, 4, 5, 6});
        fairRations(new int[]{1, 2});
    }
}
