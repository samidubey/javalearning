package com.codingbat.exercise1;

public class Problem17_In1020 {

	public static void main(String[] args) {
		Problem17_In1020 obj = new Problem17_In1020();
		System.out.println(obj.in1020(12, 99));
		System.out.println(obj.in1020(21, 12));
		System.out.println(obj.in1020(8, 99));
		System.out.println(obj.in1020(10, 20));
		System.out.println(obj.in1020(12, 12));
		System.out.println(obj.in1020(99, 99));
		System.out.println(obj.in1020(99, 10));
		System.out.println(obj.in1020(20, 20));
	}

	public boolean in1020(int num1, int num2) {
		return ((num1 >= 10 && num1 <= 20) || (num2 >= 10 && num2 <= 20));
	}

}
