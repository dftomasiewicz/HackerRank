package com.dft.easy;

import java.util.*;

public class NRClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];

        Set numberOfRanking = new HashSet();
        numberOfRanking.addAll(Arrays.asList(scores));

        List<Integer> newScores = new ArrayList();
        newScores.addAll(numberOfRanking);
        //trzeba posortowac comparatorem malejaco elementy listy

        List<Integer> newAlice = new ArrayList<>();
        for(int a : alice){
            newAlice.add(a);
        }

        for (int i = 0; i < alice.length; i++) {
            for (int j = 0; j < newScores.size(); j++) {
                if (newAlice.get(i) >= newScores.get(j)) {
                    result[i] = j + 1;
                } else {
                    result[i] = newScores.size() + 2;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(new int[] {100,100,50,40,40,20,10}, new int[] {5,25,50,120}));
        System.out.println(climbingLeaderboard(new int[] {100,90,90,80,75,60}, new int[] {50,65,77,90,102}));
    }
}
