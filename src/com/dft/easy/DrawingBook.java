package com.dft.easy;

public class DrawingBook {

    static int pageCount(int n, int p) {
        int i;
        int counter = 0;
        if (p <= n / 2) {
            for (i = 1; i <= n / 2; i += 2) {
                if (p > i) {
                    counter++;
                } else {
                    return counter;
                }
            }
        } else if (n % 2 == 0) {
            if (p == n) {
                return 0;
            }
            for (i = n; i >= n / 2; i -= 2) {
                if (p < i) {
                    counter++;
                } else {
                    return counter;
                }
            }
        } else if (n % 2 != 0) {
            if (p >= n - 1) {
                return 0;
            }
            for (i = n - 1; i >= n / 2; i -= 2) {
                if (p < i) {
                    counter++;
                } else {
                    return counter;
                }
            }

        }
        return counter;
    }

    static int solve(int n, int p){
        int total = n/2;
        int right = p/2;
        int left = total - right;
        if(right < left){
            return right;
        }
        else {
            return left;
        }
    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
        System.out.println(pageCount(5, 4));
        System.out.println(pageCount(7, 4));
        System.out.println();
        System.out.println(solve(6,2));
        System.out.println(solve(5,4));
        System.out.println(solve(7,4));

    }
}
