package com.dft.easy;

import java.util.Arrays;

public class AcmIcpcTeam {

    static int[] acmTeam(String[] topics) {
        int maxNumberOfTopic = 0;
        int maxNumberOf2PersonsTeam = 0;
        for (int i = 0; i < topics.length - 1; i++) {
            for (int j = i + 1; j < topics.length; j++) {
                int counter = 0;
                for (int k = 0; k < topics[i].length(); k++) {
                    if ((Integer.parseInt(Character.toString(topics[i].charAt(k))) == 1) ||
                            Integer.parseInt(Character.toString(topics[j].charAt(k))) == 1) {
                        counter++;
                    }
                }
                if (counter == maxNumberOfTopic) {
                    maxNumberOf2PersonsTeam++;
                } else if (counter > maxNumberOfTopic) {
                    maxNumberOf2PersonsTeam = 1;
                    maxNumberOfTopic = counter;
                }
            }
        }

        int[] answer = {maxNumberOfTopic, maxNumberOf2PersonsTeam};
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11100", "11010", "00101"})));
        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11110", "00010"})));
    }
}
