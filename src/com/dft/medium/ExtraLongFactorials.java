package com.dft.medium;

import java.math.BigInteger;

public class ExtraLongFactorials {

    static void extraLongFactorials(int n) {
        BigInteger bi = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
        extraLongFactorials(30);
    }
}
