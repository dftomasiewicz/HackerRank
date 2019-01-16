package com.dft.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManasaAndStones {

    static int[] stones(int n, int a, int b) {

        if(a == b){
            int[] answer = new int[1];
            answer[0] = (n - 1) * a;
            return answer;
        }

        int bigger = a > b ? a : b;
        int smaller = a < b ? a : b;

        List<Integer> stonesList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int stone = i * bigger + (n - 1 - i) * smaller;
            stonesList.add(stone);
        }

        int[] answer = new int[stonesList.size()];

        for(int i = 0; i < answer.length; i++){
            answer[i] = stonesList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stones(2, 2, 3)));
        System.out.println(Arrays.toString(stones(3, 1, 2)));
        System.out.println(Arrays.toString(stones(4, 10, 100)));
        System.out.println(Arrays.toString(stones(58, 69, 24)));
        System.out.println(Arrays.toString(stones(83, 86, 81)));
        System.out.println(Arrays.toString(stones(73, 25, 25)));
        System.out.println(Arrays.toString(stones(12, 73, 82)));
        System.out.println(Arrays.toString(stones(5, 3, 23)));
    }
}
