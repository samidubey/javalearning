package com.codingbat.exercise1;

public class Problem2_Diff21 {

    public int diff21(int n) {

        int difference = 21 - n;

        return (difference >= 0) ? difference : Math.abs(difference) * 2;

    }

    public static void main(String[] args) {
        Problem2_Diff21 obj = new Problem2_Diff21();
        System.out.println(obj.diff21(20));
        System.out.println(obj.diff21(22));
    }
}
