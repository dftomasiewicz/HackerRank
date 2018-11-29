package com.dft.easy;

public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        int commonLength = 0;

        for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
            if (s.charAt(i) == t.charAt(i))
                commonLength++;
            else
                break;
        }
        if ((s.length() + t.length() - 2 * commonLength) > k) {
            return "No";
        } else if ((s.length() + t.length() - 2 * commonLength) % 2 == k % 2) {
            return "Yes";
        } else if ((s.length() + t.length() - k) < 0) {
            return "Yes";
        } else {
            return "No";
        }
    }


//    static String appendAndDelete3(String s, String t, int k) {
//        int counter,index = 0;
//        int smaller = s.length() < t.length() ? s.length() : t.length();
//
//        for (int i = 0; i < smaller; i++) {
//            index = i;
//            if (s.toCharArray()[i] != t.toCharArray()[i]) {
//                break;
//            }
//            if(i == smaller - 1) {
//                index++;
//            }
//        }
//
//        counter = (s.length() - index) + (t.length() - index);
//
//        if (counter <= k) {
//            return "Yes";
//        } else {
//            return "No";
//        }
//    }

//    static String appendAndDelete2(String s, String t, int k) {
//        int counter = 0;
//        char[] newS = s.toCharArray();
//        char[] newT = t.toCharArray();
//        int smaller = s.length() < t.length() ? s.length() : t.length();
//
//        for (int i = 0; i < smaller; i++) {
//            if (newS[i] != newT[i]) {
//                counter += 2;
//            }
//        }
//
//        counter += Math.abs(s.length() - t.length());
//
//        if (counter <= k) {
//            return "Yes";
//        } else {
//            return "No";
//        }
//    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("abc", "def", 6));
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("aba", "aba", 7));
        System.out.println(appendAndDelete("ashley", "ash", 2));
        System.out.println(appendAndDelete("qwerasdf", "qwerbsdf", 6));
        System.out.println(appendAndDelete("abcd", "abcdert", 10));
    }
}
