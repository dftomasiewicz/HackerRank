package com.dft.java.easyTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return false;
        }

        while (a.length() > 0) {
            b = b.replaceFirst(String.valueOf(a.charAt(0)), "");
            a = a.replaceFirst(String.valueOf(a.charAt(0)), "");
        }

        if (a.isEmpty() && b.isEmpty()) {
            System.out.println("Anagrams");
            return true;
        }
        System.out.println("Not Anagrams");
        return false;
    }

    static boolean isAnagram2(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();
        int index;

        for (int i = 0; i < a.length(); i++) {
            index = b.indexOf(a.charAt(i));
            if (index == -1) {
                System.out.println("Not Anagrams");
                return false;
            } else {
                //this removes b[index]
                b = b.substring(0, index) + b.substring(index + 1);
            }
        }
        System.out.println("Anagrams");
        return true;
    }

    static boolean isAnagram3(String a, String b) {

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return false;
        }

        a.toLowerCase();
        b.toLowerCase();

        char[] aArray = a.toCharArray();
        Arrays.sort(aArray);
        char[] bArray = b.toCharArray();
        Arrays.sort(bArray);

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] != bArray[i]) {
                System.out.println("Not Anagrams");
                return false;
            }
        }

        System.out.println("Anagrams");
        return true;

    }

    static boolean isAnagram4(String a, String b) {

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return false;
        }

        a.toLowerCase();
        b.toLowerCase();
        Map<Character, Integer> letterOccurenceOfA = new HashMap<>();
        Map<Character, Integer> letterOccurenceOfB = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            if (letterOccurenceOfA.containsKey(a.charAt(i))) {
                letterOccurenceOfA.put(a.charAt(i), letterOccurenceOfA.get(a.charAt(i) + 1));
            } else {
                letterOccurenceOfA.put(a.charAt(i), 1);
            }
            if (letterOccurenceOfB.containsKey(b.charAt(i))) {
                letterOccurenceOfB.put(b.charAt(i), letterOccurenceOfB.get(b.charAt(i) + 1));
            } else {
                letterOccurenceOfB.put(b.charAt(i), 1);
            }
        }

        boolean isAnagrams = true;
        for (char c : letterOccurenceOfA.keySet()) {
            if (letterOccurenceOfA.get(c) != (letterOccurenceOfB.get(c))) {
                isAnagrams = false;
            }
        }

        if (isAnagrams) {
            System.out.println("Anagrams");
            return isAnagrams;
        } else {
            System.out.println("Not Anagrams");
            return isAnagrams;
        }
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "margana"));
        System.out.println(isAnagram("anagramm", "marganaa"));
    }

}


