package com.dft.easy;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            if (sum == d) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1); s.add(2); s.add(1); s.add(3); s.add(2);
        System.out.println(birthday(s,3,2));

        List<Integer> s1 = new ArrayList<>();
        s1.add(1); s1.add(1); s1.add(1); s1.add(1); s1.add(1); s1.add(1);
        System.out.println(birthday(s1,3,2));

        List<Integer> s2 = new ArrayList<>();
        s2.add(4); s2.add(1);
        System.out.println(birthday(s2,4,1));
    }

}
