package com.codingbat.exercise1;

public class Problem13_Or35 {
	public static void main(String[] args) {
		Problem13_Or35 obj = new Problem13_Or35();
		System.out.println(obj.or35(3));
		System.out.println(obj.or35(10));
		System.out.println(obj.or35(8));
		System.out.println(obj.or35(22));
		System.out.println(obj.or35(0));
		System.out.println(obj.or35(-1));

	}

	public boolean or35(int n) {
		if (n > 0 && (n % 3 == 0 || n % 5 == 0)) {
			return true;
		}
		return false;
	}

}
