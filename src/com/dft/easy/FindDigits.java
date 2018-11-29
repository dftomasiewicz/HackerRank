package com.dft.easy;

public class FindDigits {

    static int findDigits(int n) {
        String nString = Integer.toString(n);
        char[] nArray = nString.toCharArray();
        int counter = 0;
        for(int i = 0; i < nArray.length; i++){
            int nAi = Integer.parseInt(Character.toString(nArray[i]));
            if(nAi != 0 && n % nAi == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(111));
        System.out.println(findDigits(12));
        System.out.println(findDigits(1012));

    }
}
