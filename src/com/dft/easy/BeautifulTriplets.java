package com.dft.easy;

public class BeautifulTriplets {

    static int beautifulTriplets(int d, int[] arr) {
        int isTriplet = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int counter = 1;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if ((arr[j] - arr[i]) > d) {
                    break;
                } else if (arr[j] - arr[i] == d) {
                    counter++;
                    for (int k = j + 1; k < arr.length; k++) {
                        if ((arr[k] - arr[j]) > d) {
                            break;
                        } else if (arr[k] - arr[j] == d) {
                            counter++;
                        }
                        if (counter == 3) {
                            isTriplet++;
                            break;
                        }
                    }
                }
            }
        }
        return isTriplet;
    }

    public static void main(String[] args) {
        System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
        System.out.println(beautifulTriplets(3, new int[]{1, 6, 7, 7, 8, 10, 12, 13, 14, 19}));
    }
}
