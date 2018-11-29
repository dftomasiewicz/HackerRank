package com.dft.easy;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {
        int studentsOnTime = 0;
        for (int s : a) {
            if (s <= 0) {
                studentsOnTime++;
            }
            if (studentsOnTime >= k) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(angryProfessor(3, new int[]{-1, -3, 4, 2}));
        System.out.println(angryProfessor(2, new int[]{0, -1, 2, 1}));
    }
}
