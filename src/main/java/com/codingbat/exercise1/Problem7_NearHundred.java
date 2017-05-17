package com.codingbat.exercise1;

public class Problem7_NearHundred {
    public static void main(String[] args) {
        Problem7_NearHundred obj = new Problem7_NearHundred();
        System.out.println(obj.nearHundred(93));
        System.out.println(obj.nearHundred(90));
        System.out.println(obj.nearHundred(89));
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));

    }
}
