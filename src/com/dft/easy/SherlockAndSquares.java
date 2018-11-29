package com.dft.easy;

public class SherlockAndSquares {

    static int squares(int a, int b) {
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        int start = (int) Math.ceil(sqrtA);
        int end = (int) Math.floor(sqrtB);
        int counter = 0;

        for(int i = start; i <= end; i++){
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(squares(3,9));
        System.out.println(squares(17,24));

    }
}
