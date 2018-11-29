package com.dft.easy;

public class BeautifulDaysAtTheMovies {

    static int beautifulDays(int i, int j, int k) {
        int result = 0;
        for (int a = i; a <= j; a++) {
            StringBuilder temp = new StringBuilder();
            temp.append(a).reverse();
            int absResult = Math.abs(a - Integer.parseInt(temp.toString()));
            //trzeba zamienic StringBulidera na Stringa, a potem zparsować na inta
            if(absResult % k == 0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20,23,6));
    }
}
