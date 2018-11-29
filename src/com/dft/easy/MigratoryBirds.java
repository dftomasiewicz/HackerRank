package com.dft.easy;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        int array[] = new int[6];
        for(int id : arr){
            array[id]++;
        }
        int max = 0;
        int result = 0;
        for(int i = 1; i < 6; i++){
            if(array[i] > max){
                max = array[i];
                result = i;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1); s.add(1); s.add(2); s.add(2); s.add(3);
        System.out.println(migratoryBirds(s));

        List<Integer> s1 = new ArrayList<>();
        s1.add(1); s1.add(4); s1.add(4); s1.add(4); s1.add(5); s1.add(3);
        System.out.println(migratoryBirds(s1));
    }
}
