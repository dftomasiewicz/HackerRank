package com.dft.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLane {

    static int[] serviceLane(int n, int[] w, int[][] cases) {
        List<Integer> answer = new ArrayList<>();

        for(int[] arr : cases){
            int min = Integer.MAX_VALUE;
            for(int i = arr[0]; i <= arr[1]; i++){
                if(w[i] < min){
                    min = w[i];
                }
            }
            answer.add(min);
        }

        int[] arrayAnswer = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            arrayAnswer[i] = answer.get(i);
        }

        return arrayAnswer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(serviceLane(8, new int[] {2,3,1,2,3,2,3,3},
                new int[][] {{0,3}, {4,6}, {6,7}, {3,5}, {0,7}})));
        System.out.println(Arrays.toString(serviceLane(5, new int[] {1,2,2,2,1},
                new int[][] {{2,3}, {1,4}, {2,4}, {2,4}, {2,3}})));

    }
}
