package com.dft.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CavityMap {

    static String[] cavityMap(String[] grid) {

        if (grid.length < 3) {
            return grid;
        }

        int[][] intGrid = new int[grid.length][grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                intGrid[i][j] = Character.getNumericValue(grid[i].charAt(j));
            }
        }

        for (int i = 1; i < intGrid.length - 1; i++) {
            for (int j = 1; j < intGrid[i].length - 1; j++) {
                if (intGrid[i][j - 1] < intGrid[i][j] && intGrid[i][j + 1] < intGrid[i][j] &&
                        intGrid[i - 1][j] < intGrid[i][j] && intGrid[i + 1][j] < intGrid[i][j]) {
                    intGrid[i][j] = 10;
                }
            }
        }

        String[] answerGrid = new String[grid.length];
        for (int i = 0; i < answerGrid.length; i++) {
            answerGrid[i] = new String();
        }

        for (int i = 0; i < intGrid.length; i++) {
            for (int j = 0; j < intGrid[i].length; j++) {
                if (intGrid[i][j] == 10) {
                    answerGrid[i] += ("X");
                } else {
                    answerGrid[i] += (Integer.toString(intGrid[i][j]));
                }
            }
        }

        return answerGrid;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cavityMap(new String[]{"989", "191", "111"})));
        System.out.println(Arrays.toString(cavityMap(new String[]{"1112", "1912", "1892", "1234"})));
    }
}
