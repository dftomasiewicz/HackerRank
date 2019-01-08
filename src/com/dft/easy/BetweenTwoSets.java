package com.dft.easy;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        int totalX = 0;
        List<Integer> factors = new ArrayList<>();

        for(int i = a[a.length - 1]; i <= b[0]; i++){
            int counter = 0;
            for(int j = 0; j < a.length; j++){
                if(i % a[j] == 0){
                    counter++;
                }
            }
            if(counter == a.length){
                factors.add(i);
            }
        }

        for(int factor : factors){
            int counter = 0;
            for(int i = 0; i < b.length; i++){
                if(b[i] % factor == 0){
                    counter++;
                }
            }
            if(counter == b.length){
                totalX++;
            }
        }
        return totalX;
    }

    public static void main(String[] args) {
        System.out.println(getTotalX(new int[] {2,6}, new int[] {24,36}));
        System.out.println(getTotalX(new int[] {2,4}, new int[] {16,32,96}));
    }

}
