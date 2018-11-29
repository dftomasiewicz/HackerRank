package com.dft.easy;

import java.util.Scanner;

public class CompareTheTriplets {

    public static void compareTriplets(int[] a, int[] b) {
        int aResult = 0;
        int bResult = 0;
        int[] result = new int[2];
        for (int i = 0; i < 3; i++){
            if  (a[i] > b[i]){
                aResult += 1;
            } else if (a[i] < b[i]){
                bResult += 1;
            }
        }
        result[0] = aResult;
        result[1] = bResult;
        System.out.printf("%d %d", aResult, bResult);
//        printf formatuje drukowanie, w cudzysłowie piszemy np.
//        Hello %s!, name (ktore jest polem) i podstawi nam
//        za %s dane imie ktore jest stringiem
//        %s - formatuje (podstawia) cos co jest stringiem
//        %f - floating number zmiennoprzecinkowe
//        %d - decimal integer calkowite
//        przy floatach mozna od razu ustawic dokladnosc wyswietlania
//        %.2f pokaze dwie cifry po przecinku
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] aTriplet = new int[3];
        int[] bTriplet = new int[3];
        for(int i = 0; i < 3; i++){
            aTriplet[i] = scanner.nextInt();
        }
        for(int i = 0; i < 3; i++){
            bTriplet[i] = scanner.nextInt();
        }
        compareTriplets(aTriplet,bTriplet);
    }



}
