package com.dft.easy;

public class UtopianTree {

    static int utopianTree(int n) {
        int height = 1;
        int cycles = 0;
        for(int i = 0; i < n; i++){
            if(cycles % 2 == 0) {
                height *= 2;
                cycles++;
            } else {
                height += 1;
                cycles++;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }
}
