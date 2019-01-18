package com.dft.easy;

import java.util.LinkedHashMap;
import java.util.Map;

public class HappyLadyBugs {

    static String happyLadybugs(String b) {
        char[] board = b.toCharArray();
        int underscores = 0;
        for (char c : board) {
            if (c == '_') {
                underscores++;
            }
        }

        if (underscores == board.length) {
            return "YES";
        } else if (underscores == 0) {
            int counter = 0;
            for (int i = 0; i < board.length - 1; i++) {
                if (counter == 0 && board[i] != board[i + 1]) {
                    return "NO";
                } else if (board[i] == board[i + 1]) {
                    counter++;
                } else {
                    counter = 0;
                }
            }
        }

        Map<Character, Integer> ladybugs = new LinkedHashMap<>();
        for (char ladybug : board) {
            ladybugs.put(ladybug, 0);
        }
        for (char ladybug : board) {
            ladybugs.put(ladybug, ladybugs.get(ladybug) + 1);
        }

        int oneOccurrence = 0;
        for (char occurrence : ladybugs.keySet()) {
            if (ladybugs.get(occurrence) == 1) {
                oneOccurrence++;
            }
        }

        if (oneOccurrence > 1) {
            return "NO";
        } else if (oneOccurrence == 1) {
            if (ladybugs.containsKey('_')) {
                if (ladybugs.get('_') != 1) {
                    return "NO";
                } else {
                    return "YES";
                }
            } else {
                return "NO";
            }
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        System.out.println(happyLadybugs("YYR_B_BR"));
        System.out.println(happyLadybugs("RBY_YBR"));
        System.out.println(happyLadybugs("X_Y__X"));
        System.out.println(happyLadybugs("__"));
        System.out.println(happyLadybugs("B_RRBR"));
        System.out.println(happyLadybugs("AABBC"));
        System.out.println(happyLadybugs("AABBC_C"));
        System.out.println(happyLadybugs("_"));
        System.out.println(happyLadybugs("DD__FQ_QQF"));
        System.out.println(happyLadybugs("AABCBC"));
    }
}
