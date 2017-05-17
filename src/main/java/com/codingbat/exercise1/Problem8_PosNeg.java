package com.codingbat.exercise1;

public class Problem8_PosNeg {
    public static void main(String[] args) {
        Problem8_PosNeg obj = new Problem8_PosNeg();
        System.out.println(obj.posNeg(-1, 1, false));
        System.out.println(obj.posNeg(1, -1, false));
        System.out.println(obj.posNeg(1, 1, false));
        System.out.println(obj.posNeg(-1, -1, true));
        System.out.println(obj.posNeg(-1, -1, false));

    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

}
