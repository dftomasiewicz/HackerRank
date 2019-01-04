package com.dft.easy;

public class HalloweenSale {

    static int howManyGames(int p, int d, int m, int s) {

        if (p > s) {
            return 0;
        } else if (p == s) {
            return 1;
        }

        int counter = 0;
        int spendMoney = p;
        int actualPrice = p;

        while (spendMoney <= s) {
            if (actualPrice - d > m) {
                actualPrice -= d;
                spendMoney += actualPrice;
                counter++;
            } else {
                actualPrice = m;
                spendMoney += actualPrice;
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(howManyGames(20, 3, 6, 80));
        System.out.println(howManyGames(20, 3, 6, 85));
        System.out.println(howManyGames(16, 2, 1, 9981));
    }
}
