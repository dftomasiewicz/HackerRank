package com.dft.medium;

import java.util.Arrays;

public class OrganizingContainersOfBalls {

    static String organizingContainers(int[][] container) {
        int[] boxTotal = new int[container.length];
        int[] ballTotal = new int[container.length];

        for (int i = 0; i < container.length; i++) {
            for (int j = 0; j < container[i].length; j++) {
                boxTotal[i] += container[i][j];
                ballTotal[i] += container[j][i];
            }
        }

        Arrays.sort(boxTotal);
        Arrays.sort(ballTotal);

        for (int i = 0; i < container.length; i++) {
            if (boxTotal[i] != ballTotal[i]) {
                return "Impossible";
            }
        }
        return "Possible";
    }

    public static void main(String[] args) {
        System.out.println(organizingContainers(new int[][]{{0, 2}, {1, 1}}));
        System.out.println(organizingContainers(new int[][]{{1, 1}, {1, 1}}));
        System.out.println(organizingContainers(new int[][]{{1, 3, 1}, {2, 1, 2}, {3, 3, 3}}));
        System.out.println(organizingContainers(new int[][]{{0, 2, 1}, {1, 1, 1}, {2, 0, 0}}));

    }
}
