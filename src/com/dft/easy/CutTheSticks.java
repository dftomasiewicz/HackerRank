package com.dft.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int iValue = arr[i];
            if (arr[i] != 0) {
                int counter = 0;
                for (int j = i; j < arr.length; j++) {
                    counter++;
                    arr[j] -= iValue;
                }
                result.add(counter);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cutTheSticks(new int[] {5,4,4,2,2,8})));
        System.out.println(Arrays.toString(cutTheSticks(new int[] {1,2,3,4,3,3,2,1})));
    }
}
