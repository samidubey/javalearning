package com.codingbat.exercise1;

public class Problem3_ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking == true) && (hour < 7 || hour > 20);
    }

    public static void main(String[] args) {

        Problem3_ParrotTrouble obj = new Problem3_ParrotTrouble();
        System.out.println(obj.parrotTrouble(true, 6));
        System.out.println(obj.parrotTrouble(true, 7));
        System.out.println(obj.parrotTrouble(false, 6));

    }

}
