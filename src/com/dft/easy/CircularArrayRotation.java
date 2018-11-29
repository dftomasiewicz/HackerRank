package com.dft.easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CircularArrayRotation {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        List<Integer> myList = new ArrayList<>();
        int[] result = new int[queries.length];

        for (int i : a) {
            myList.add(i);
        }
        for (int i = 0; i < k; i++) {
            myList.add(0, myList.get(myList.size() - 1));
            myList.remove(myList.size() - 1);
        }
        for (int i = 0; i < queries.length; i++) {
            result[i] = myList.get(queries[i]);
        }
        return result;
    }

//    Ponizej rozwiazanie dobre, ale za dlugo liczy
//    static int[] circularArrayRotation2(int[] a, int k, int[] queries) {
//        int tempAcctual = 0;
//        int tempNext = 0;
//        int[] result = new int[queries.length];
//        for (int j = 0; j < k; j++) {
//            for (int i = 0; i < a.length; i++) {
//                if (i != 0) {
//                    tempNext = a[i];
//                    a[i] = tempAcctual;
//                    tempAcctual = tempNext;
//                } else {
//                    tempAcctual = a[0];
//                    a[0] = a[a.length - 1];
//                }
//            }
//        }
//        for (int i = 0; i < queries.length; i++) {
//            result[i] = a[queries[i]];
//        }
//        return a;
//    }

    public static void main(String[] args) {
        System.out.println(circularArrayRotation(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2}));
        System.out.println(circularArrayRotation(new int[]{3, 4, 5}, 2, new int[]{0, 1, 2}));
    }
}
