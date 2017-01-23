package com.codingbat.exercise1;

public class Problem1_Sleepin {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    public static void main(String[] args) {
        Problem1_Sleepin obj = new Problem1_Sleepin();
        System.out.println(obj.sleepIn(false, false));
    }
}
