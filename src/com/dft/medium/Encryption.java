package com.dft.medium;

import java.util.Arrays;

public class Encryption {

    static String encryption(String s) {
        double lengthOfS = (double) s.length();
        int rows = (int) Math.floor(Math.sqrt(lengthOfS));
        int columns = (int) Math.ceil(Math.sqrt(lengthOfS));
        if (rows * columns < s.length()) {
            rows = columns;
        }
        
        char[][] arrayToEncryption = new char[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns && (r * columns + c) < s.length(); c++) {
                arrayToEncryption[r][c] = s.charAt(r * columns + c);
            }
        }

        StringBuilder encrytpionString = new StringBuilder();
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows; r++) {
                if (arrayToEncryption[r][c] != '\u0000') {
                    encrytpionString.append(arrayToEncryption[r][c]);
                }
            }
            encrytpionString.append(' ');
        }

        return encrytpionString.toString();
    }

    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));
        System.out.println(encryption("feedthedog"));
        System.out.println(encryption("chillout"));
        System.out.println(encryption("ifmanwasmeanttostayonthegroundgodwouldhavegivenusroots"));
    }
}
