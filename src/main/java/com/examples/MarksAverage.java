package com.examples;

public class MarksAverage {
    public static void main(String[] args) {
        marksAverage();
    }

    public static void marksAverage() {
        float course1 = 80;
        float course2 = 90;
        float course3 = 95;
        float course4 = 85;
        float course5 = 95;
        float course6 = 90;
        float average;
        Float percentage;
        average = (course1 + course2 + course3 + course4 + course5 + course6) / 600;
        percentage = average * 100;
        System.out.println(average);
        System.out.println(percentage + "%");
    }
}
