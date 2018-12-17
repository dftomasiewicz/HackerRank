package com.dft.medium;

import java.util.HashSet;
import java.util.Set;

public class QueensAttackII {

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        int counter = 0;
        int r;
        int c;
        int[] coordinateNearestObstacle = new int[2];


//        if we go up (r++)
        coordinateNearestObstacle[0] = n + 1;
        r = r_q + 1;
        for (; r <= n; r++) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r && coordinates[1] == c_q) {
                    coordinateNearestObstacle[0] = r;
                }
            }
            if (coordinateNearestObstacle[0] != n + 1) {
                break;
            }
        }
        counter += coordinateNearestObstacle[0] - (r_q + 1);


//        if we go diagonal up and right (r++, c++)
        coordinateNearestObstacle[0] = n + 1;
        coordinateNearestObstacle[1] = n + 1;
        r = r_q + 1;
        c = c_q + 1;
        for (; r <= n && c <= n; r++, c++) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r && coordinates[1] == c) {
                    coordinateNearestObstacle[0] = r;
                    coordinateNearestObstacle[1] = c;
                }
            }
            if (coordinateNearestObstacle[0] != n + 1) {
                break;
            }
        }
        r = r_q + 1;
        c = c_q + 1;
        for (; r < coordinateNearestObstacle[0] && c < coordinateNearestObstacle[1]; r++, c++) {
            counter++;
        }


//        if we go right (c++)
        coordinateNearestObstacle[1] = n + 1;
        c = c_q + 1;
        for (; c <= n; c++) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r_q && coordinates[1] == c) {
                    coordinateNearestObstacle[1] = c;
                }
            }
            if (coordinateNearestObstacle[1] != n + 1) {
                break;
            }
        }
        counter += coordinateNearestObstacle[1] - (c_q + 1);


//        if we go diagonal down and right (r--, c++)
        coordinateNearestObstacle[0] = 0;
        coordinateNearestObstacle[1] = n + 1;
        r = r_q - 1;
        c = c_q + 1;
        for (; r >= 1 && c <= n; r--, c++) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r && coordinates[1] == c) {
                    coordinateNearestObstacle[0] = r;
                    coordinateNearestObstacle[1] = c;
                }
            }
            if (coordinateNearestObstacle[0] != 0) {
                break;
            }
        }
        r = r_q - 1;
        c = c_q + 1;
        for (; r > coordinateNearestObstacle[0] && c < coordinateNearestObstacle[1]; r--, c++) {
            counter++;
        }


//        if we go down (r--)
        coordinateNearestObstacle[0] = 0;
        r = r_q - 1;
        for (; r >= 1; r--) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r && coordinates[1] == c_q) {
                    coordinateNearestObstacle[0] = r;
                }
            }
            if (coordinateNearestObstacle[0] != 0) {
                break;
            }
        }
        counter += (r_q - 1) - coordinateNearestObstacle[0];


//        if we go diagonal down and left (r--, c--)
        coordinateNearestObstacle[0] = 0;
        coordinateNearestObstacle[1] = 0;
        r = r_q - 1;
        c = c_q - 1;
        for (; r >= 1 && c >= 1; r--, c--) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r && coordinates[1] == c) {
                    coordinateNearestObstacle[0] = r;
                    coordinateNearestObstacle[1] = c;
                }
            }
            if (coordinateNearestObstacle[0] != 0) {
                break;
            }
        }
        r = r_q - 1;
        c = c_q - 1;
        for (; r > coordinateNearestObstacle[0] && c > coordinateNearestObstacle[1]; r--, c--) {
            counter++;
        }


//        if we go left (c--)
        coordinateNearestObstacle[1] = 0;
        c = c_q - 1;
        for (; c >= 1; c--) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r_q && coordinates[1] == c) {
                    coordinateNearestObstacle[1] = c;
                }
            }
            if (coordinateNearestObstacle[1] != 0) {
                break;
            }
        }
        counter += (c_q - 1) - coordinateNearestObstacle[1];


//        if we go diagonal left and up (r++, c--)
        coordinateNearestObstacle[0] = n + 1;
        coordinateNearestObstacle[1] = 0;
        r = r_q + 1;
        c = c_q - 1;
        for (; r <= n && c >= 1; r++, c--) {
            for (int[] coordinates : obstacles) {
                if (coordinates[0] == r && coordinates[1] == c) {
                    coordinateNearestObstacle[0] = r;
                    coordinateNearestObstacle[1] = c;
                }
            }
            if (coordinateNearestObstacle[0] != n + 1) {
                break;
            }
        }
        r = r_q + 1;
        c = c_q - 1;
        for (; r < coordinateNearestObstacle[0] && c > coordinateNearestObstacle[1]; r++, c--) {
            counter++;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(queensAttack(5, 3, 4, 3, new int[][]{{5, 5}, {4, 2}, {2, 3}}));
        System.out.println(queensAttack(1, 0, 1, 1, new int[][]{{}}));
    }
}
