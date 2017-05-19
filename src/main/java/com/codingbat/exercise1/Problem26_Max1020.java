package com.codingbat.exercise1;

public class Problem26_Max1020 {

	public static void main(String[] args) {
		Problem26_Max1020 obj = new Problem26_Max1020();
		System.out.println(obj.max1020(19, 11));
		System.out.println(obj.max1020(19, 19));
		System.out.println(obj.max1020(11, 19));
		System.out.println(obj.max1020(21, 22));

	}

	public int max1020(int a, int b) {
		boolean max = a > b;
		if (max == true) {
			if (a >= 10 && a <= 20) {
				return a;
			} else if (b >= 10 && b <= 20) {
				return b;
			}
		} else {
			if (b >= 10 && b <= 20) {
				return b;
			} else if (a >= 10 && a <= 20) {
				return a;
			}
		}
		return 0;
	}

}
