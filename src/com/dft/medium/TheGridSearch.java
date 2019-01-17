package com.dft.medium;

public class TheGridSearch {

    static String gridSearch(String[] G, String[] P) {

        int rowsG = G.length;
        int columnsG = G[0].length();
        int rowsP = P.length;
        int columnsP = P[0].length();
        int counter = 0;
        boolean result = false;

        for (int k = 0; k <= rowsG - rowsP; k++) {
            int end = columnsP;
            int start = 0;

            while (end <= columnsG) {
                if (G[k].substring(start, end).equals(P[0])) {
                    for (int i = 1; i < rowsP; i++) {
                        if (G[k + i].substring(start, end).equals(P[i])) {
                            counter++;
                            if (counter == rowsP - 1) {
                                result = true;
                            }
                        }
                    }
                }
                counter = 0;
                end++;
                start++;
            }
        }

        if (result) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        System.out.println(gridSearch(
                new String[]{   "7283455864",
                                "6731158619",
                                "8988242643",
                                "3830589324",
                                "2229505813",
                                "5633845374",
                                "6473530293",
                                "7053106601",
                                "0834282956",
                                "4607924137"},
                new String[]{   "9505",
                                "3845",
                                "3530"}));

        System.out.println(gridSearch(
                new String[]{   "123412",
                                "561212",
                                "123634",
                                "781288"},
                new String[]{   "12",
                                "34"}));
    }
}
