package com.codingbat.exercise1;

public class Problem29_LastDigit {

	public static void main(String[] args) {
		Problem29_LastDigit obj = new Problem29_LastDigit();
		System.out.println(obj.lastDigit(27, 17));
		System.out.println(obj.lastDigit(27, 27));
		System.out.println(obj.lastDigit(0, 0));
		System.out.println(obj.lastDigit(12, 13));

	}

	public boolean lastDigit(int a, int b) {
		int mod1 = a % 10;
		int mod2 = b % 10;

		return (mod1 == mod2);

	}

}
