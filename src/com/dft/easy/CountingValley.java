package com.dft.easy;

import java.util.Arrays;
import java.util.List;

public class CountingValley {

    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int level = 0;
        int counter = 0;
        for (int i = 0; i < steps.length - 1; i++) {
            if (level == 0) {
                if (steps[i] == 'D') {
                    counter++;
                    level -= 1;
                } else {
                    level += 1;
                }
            } else if (steps[i] == 'U') {
                level += 1;
            } else if (steps[i] == 'D') {
                level -= 1;
            }
        }
        return counter;
    }

    static int countingValleys2 (int n, String s){
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : s.toCharArray()) {
            if (c == 'U') ++lvl;
            if (c == 'D') --lvl;
            if (lvl == 0 && c == 'U') ++v;
        }
        return v;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
        System.out.println(countingValleys(8, "DDUUUUDD"));
    }
}
