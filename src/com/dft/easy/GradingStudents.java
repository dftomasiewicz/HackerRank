package com.dft.easy;

import java.util.Arrays;

public class GradingStudents {

    public static int[] gradingStudents(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 38) {
                roundedGrades[i] = grades[i];
            } else {
                int tempGrade = grades[i];
                while (tempGrade % 5 != 0) {
                    tempGrade++;
                }
                if (tempGrade - grades[i] < 3) {
                    roundedGrades[i] = tempGrade;
                } else {
                    roundedGrades[i] = grades[i];
                }
            }
        }
        return roundedGrades;
    }

    public static void main(String[] args) {
        int[] studentsGrades = {73, 67, 38, 33};
        System.out.println(Arrays.toString(gradingStudents(studentsGrades)));

    }
}
