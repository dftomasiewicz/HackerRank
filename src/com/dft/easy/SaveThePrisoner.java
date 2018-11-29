package com.dft.easy;

public class SaveThePrisoner {

    static int saveThePrisoner(int n, int m, int s) {

        int a = s + m - 1;
        if (a > n) {
            if (a % n == 0) {
                return n;
            }
            return a % n;
        }
        return a;

//        Ponizej rozwiazanie daje prawidlowe wyniki, ale za dlugo liczy
//        int answer = 0;
//        int counter = 0;
//        for (int i = s; i <= n; i++) {
//            counter++;
//            answer = i;
//            if(counter == m){
//                return answer;
//            }
//        }
//
//        while (counter < m) {
//            for(int i = 1; i <= n; i++){
//                counter++;
//                answer = i;
//                if(counter == m){
//                    return answer;
//                }
//            }
//        }
//        return answer;
    }


    public static void main(String[] args) {
        System.out.println(saveThePrisoner(4, 6, 2));
        System.out.println(saveThePrisoner(5, 2, 1));
        System.out.println(saveThePrisoner(5, 2, 2));
        System.out.println(saveThePrisoner(7, 19, 2));
        System.out.println(saveThePrisoner(3, 7, 3));
        System.out.println(saveThePrisoner(352926151, 380324688, 94730870));


    }
}
