package com.dft.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    static void bonAppetit(List<Integer> bill, int k, int b) {
        double sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            sum += bill.get(i);
        }
        double bactual = (sum - bill.get(k)) / 2;
        if (bactual == (double) b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - (int) bactual);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(2);
        list.add(9);
        bonAppetit(list, 1, 12);
        bonAppetit(list, 1, 7);

    }
}
