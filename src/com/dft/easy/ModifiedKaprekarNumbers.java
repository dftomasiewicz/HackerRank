package com.dft.easy;

public class ModifiedKaprekarNumbers {

    static void kaprekarNumbers(int p, int q) {
        String answer = new String();

        for (int i = p; i <= q; i++) {
            long square = (long) i * (long) i;
            if (i == 1) {
                answer = answer.concat("1 ");
            }
            if (i > 3) {
                String stringSquare = Long.toString(square);
                int left = Integer.parseInt(stringSquare.substring(0, stringSquare.length() / 2));
                int right = Integer.parseInt(stringSquare.substring(stringSquare.length() / 2));
                if (left + right == i && left != 0 && right != 0) {
                    answer = answer.concat(i + " ");
                }
            }
        }

        if (answer.isEmpty()) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        kaprekarNumbers(1, 10000);
        kaprekarNumbers(400, 700);

    }
}
