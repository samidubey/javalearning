package com.codingbat.exercise1;

public class Problem23_IntMax {

	public static void main(String[] args) {
		Problem23_IntMax obj = new Problem23_IntMax();
		System.out.println(obj.intMax(1, 2, 3));
		System.out.println(obj.intMax(4, 5, 6));
		System.out.println(obj.intMax(4, 7, 6));
		System.out.println(obj.intMax(4, 8, 8));
		System.out.println(obj.intMax(8, 8, 8));
		System.out.println(obj.intMax(0, 0, 0));

	}

	public int intMax(int a, int b, int c) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			return c;
		}
		return max;

	}

}
