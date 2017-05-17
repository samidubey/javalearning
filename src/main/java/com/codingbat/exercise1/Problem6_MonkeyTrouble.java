package com.codingbat.exercise1;

public class Problem6_MonkeyTrouble {

    public static void main(String[] args) {
        Problem6_MonkeyTrouble obj = new Problem6_MonkeyTrouble();
        System.out.println(obj.monkeyTrouble(true, true));
        System.out.println(obj.monkeyTrouble(false, false));
        System.out.println(obj.monkeyTrouble(true, false));

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile != true & bSmile != true) || (aSmile == true & bSmile == true);

    }
}
