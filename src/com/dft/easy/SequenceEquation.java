package com.dft.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {

    static int[] permutationEquation(int[] p) {
        List<Integer> myList = new ArrayList<>();
        int[] result = new int[p.length];
        for (int i : p) {
            myList.add(i);
        }
        System.out.println(myList);
        for (int i = 0; i < p.length; i++) {
            result[i] = myList.indexOf(myList.indexOf(i + 1) + 1) + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(permutationEquation(new int[]{5, 2, 1, 3, 4}));

    }
}
