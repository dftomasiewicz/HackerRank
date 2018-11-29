package com.dft.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignerPDFViewer {

    static int designerPdfViewer(int[] h, String word) {
        List<Character> alphabet = new ArrayList<>();
        alphabet.add('a');
        alphabet.add('b');
        alphabet.add('c');
        alphabet.add('d');
        alphabet.add('e');
        alphabet.add('f');
        alphabet.add('g');
        alphabet.add('h');
        alphabet.add('i');
        alphabet.add('j');
        alphabet.add('k');
        alphabet.add('l');
        alphabet.add('m');
        alphabet.add('n');
        alphabet.add('o');
        alphabet.add('p');
        alphabet.add('q');
        alphabet.add('r');
        alphabet.add('s');
        alphabet.add('t');
        alphabet.add('u');
        alphabet.add('v');
        alphabet.add('w');
        alphabet.add('x');
        alphabet.add('y');
        alphabet.add('z');

        int[] heightLetters = new int[word.length()];
        char[] wordCharArray = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            heightLetters[i] = h[alphabet.indexOf(wordCharArray[i])];
        }

        Arrays.sort(heightLetters);
        return heightLetters[heightLetters.length - 1] * word.length();
    }


    static int designerPdfViewer2(int[] h, String word) {
        char[] tabOfLetter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int[] heightLetters = new int[word.length()];
        char[] wordCharArray = word.toCharArray();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < tabOfLetter.length; j++) {
                if (wordCharArray[i] == tabOfLetter[j]) {
                    heightLetters[i] = h[j];
                    break;
                }
            }
        }

        Arrays.sort(heightLetters);
        return heightLetters[heightLetters.length - 1] * word.length();
    }


    public static void main(String[] args) {
        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, "abc"));
        System.out.println(designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, "zaba"));
        System.out.println(designerPdfViewer2(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5}, "abc"));
        System.out.println(designerPdfViewer2(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7}, "zaba"));
    }
}
