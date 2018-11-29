package com.dft.easy;

public class RepeatedString {

    static long repeatedString(String s, long n) {
        long howManyInt = n / s.length();
        long moduloN = n % s.length();
        long counter = 0;

        for (int i = 0; i < (s.length() < n ? s.length() : n); i++) {
            if (s.charAt(i) == 'a') {
                counter++;
            }
        }

        if (s.length() < n) {
            counter = counter * howManyInt;
        }

        if(moduloN != 0 &&  howManyInt != 0){
            for(int i = 0; i < moduloN; i++){
                if (s.charAt(i) == 'a') {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString("abcac", 10));
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("ababa", 3));
    }
}
