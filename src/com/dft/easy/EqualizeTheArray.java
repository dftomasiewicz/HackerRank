package com.dft.easy;

import java.util.HashMap;
import java.util.Map;

public class EqualizeTheArray {
    static int equalizeArray(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i : arr) {
            myMap.put(i, 0);
        }
        for (int i : arr) {
            myMap.put(i, myMap.get(i) + 1);
        }

        int max = 0;
        int rightKey = 0;
        for (int key : myMap.keySet()) {
            if (myMap.get(key) > max) {
                max = myMap.get(key);
                rightKey = key;
            }
        }

        int min = 0;
        for (int i : arr) {
            if (i != rightKey) {
                min++;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(equalizeArray(new int[] {1,2,2,3}));
        System.out.println(equalizeArray(new int[] {3,3,2,1,3}));
    }
}


