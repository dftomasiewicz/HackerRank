package com.dft.easy;

public class LisaWorkbook {

    static int workbook(int n, int k, int[] arr) {
        int page = 1;
        int specialProblem = 0;

        for (int problemsInChapter : arr) {
            for (int problem = 1; problem <= problemsInChapter; ) {
                if (problem == page) {
                    specialProblem++;
                }
                if (problem % k == 0 || problem == problemsInChapter) {
                    page++;
                }
                problem++;
            }
        }
        return specialProblem;
    }

    public static void main(String[] args) {
        System.out.println(workbook(2, 3, new int[]{4, 2}));
        System.out.println(workbook(5, 3, new int[]{4, 2, 6, 1, 10}));
    }
}
