package com.dft.easy;

import java.util.*;

public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int counter = 0;
        for (int i = 0; i < a.size(); i++) {
            int tempCounter = 0;
            for (int j = i; j < a.size(); j++) {
                if (a.get(j) - a.get(i) <= 1) {
                    tempCounter++;
                    if(j == a.size() - 1){
                        if (tempCounter > counter) {
                            counter = tempCounter;
                        }
                    }
                } else {
                    if (tempCounter > counter) {
                        counter = tempCounter;
                    }
                    break;
                }
            }
        }
        return counter;
    }


    public static void main(String[] args) {
        List numberList = new ArrayList();
        numberList.add(4);
        numberList.add(6);
        numberList.add(5);
        numberList.add(3);
        numberList.add(3);
        numberList.add(1);
        System.out.println(pickingNumbers(numberList));

        List numberList2 = new ArrayList();
        numberList2.add(1);
        numberList2.add(1);
        numberList2.add(2);
        numberList2.add(2);
        numberList2.add(4);
        numberList2.add(4);
        numberList2.add(5);
        numberList2.add(5);
        numberList2.add(5);
        System.out.println(pickingNumbers(numberList2));

        List numberList3 = new ArrayList();
        numberList3.add(1);
        numberList3.add(1);
        numberList3.add(2);
        numberList3.add(2);
        numberList3.add(2);
        numberList3.add(3);
        System.out.println(pickingNumbers(numberList3));
    }
}
