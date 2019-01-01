package com.dft.medium;

public class BiggerIsGreaterLexicograhicalOrder {

    static String biggerIsGreater(String w) {
//        1. Find largest index i such that (array[i - 1] < array[i])
//        Find longest non-increasing suffix
        int i = w.length() - 1;
        while (i > 0 && w.charAt(i - 1) >= w.charAt(i)) {
            i--;
        }
//        Now i is the HEAD index of the suffix

//        We check if we are at the last permutation already
//        if condition is true return false (in this case no answer)
        if (i <= 0) {
            return "no answer";
        }

//        2. Find largest index j such that j >= i and array[j] > array[i - 1]
//        Let array[i - 1] be pivot
//        Find rightmost element that exceeds the pivot
        int j = w.length() - 1;
        while (w.charAt(j) <= w.charAt(i - 1)) {
            j--;
        }
//        Now the value array[j] will become the new pivot
//        Assumption: j >= i

//        3. Swap array[j] and array[i - 1]
//        Swap the pivot with j
        StringBuilder sbW = new StringBuilder(w);
        String temp = Character.toString(w.charAt(i - 1));
        sbW.replace(i - 1, i, Character.toString(sbW.charAt(j)));
        sbW.replace(j, j + 1, temp);

//        4. Reverse the suffix starting at array[i]
        j = w.length() - 1;
        while (i < j) {
            temp = Character.toString(sbW.charAt(i));
            sbW.replace(i, i + 1, Character.toString(sbW.charAt(j)));
            sbW.replace(j, j + 1, temp);
            i++;
            j--;
        }

        return sbW.toString();
    }

    public static void main(String[] args) {
        System.out.println(biggerIsGreater("ab"));
        System.out.println(biggerIsGreater("bb"));
        System.out.println(biggerIsGreater("hefg"));
        System.out.println(biggerIsGreater("dhck"));
        System.out.println(biggerIsGreater("dkhc"));
        System.out.println();
        System.out.println(biggerIsGreater("lmon"));
        System.out.println(biggerIsGreater("dcba"));
        System.out.println(biggerIsGreater("dcbb"));
        System.out.println(biggerIsGreater("abdc"));
        System.out.println(biggerIsGreater("abcd"));
        System.out.println(biggerIsGreater("fedcbabcd"));

    }
}
