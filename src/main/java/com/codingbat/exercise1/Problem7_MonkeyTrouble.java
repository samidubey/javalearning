package com.codingbat.exercise1;

public class Problem7_MonkeyTrouble {

    public static void main(String[] args) {
        Problem7_MonkeyTrouble obj = new Problem7_MonkeyTrouble();
        System.out.println(obj.monkeyTrouble(true, true));
        System.out.println(obj.monkeyTrouble(false, false));
        System.out.println(obj.monkeyTrouble(true, false));

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile != true & bSmile != true) || (aSmile == true & bSmile == true);

    }
}
