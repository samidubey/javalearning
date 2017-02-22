package com.codingbat.exercise1;

public class Problem5_SumDouble {
    public static void main(String[] args) {
        Problem5_SumDouble obj = new Problem5_SumDouble();
        System.out.println(obj.sumDouble(1, 2));
        System.out.println(obj.sumDouble(3, 2));
        System.out.println(obj.sumDouble(2, 2));

    }

    public int sumDouble(int num1, int num2) {
        return (num1 == num2) ? 2 * (num1 + num2) : (num1 + num2);
    }
}
