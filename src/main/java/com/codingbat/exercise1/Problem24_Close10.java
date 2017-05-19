package com.codingbat.exercise1;

public class Problem24_Close10 {

	public static void main(String[] args) {
		Problem24_Close10 obj = new Problem24_Close10();
		System.out.println(obj.close10(9, 6));
		System.out.println(obj.close10(10, 6));
		System.out.println(obj.close10(9, 11));
		System.out.println(obj.close10(0, 0));
	}

	public int close10(int a, int b) {
		int nearNum1 = Math.abs(10 - a);
		int nearNum2 = Math.abs(10 - b);
		if (nearNum1 > nearNum2) {
			return b;
		} else if (nearNum1 < nearNum2) {
			return a;
		} else {
			return 0;
		}

	}

}
