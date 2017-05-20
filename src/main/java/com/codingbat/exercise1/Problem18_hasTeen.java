package com.codingbat.exercise1;

public class Problem18_hasTeen {

	public static void main(String[] args) {
		Problem18_hasTeen obj = new Problem18_hasTeen();
		System.out.println(obj.hasTeen(13, 20, 10));
		System.out.println(obj.hasTeen(20, 19, 10));
		System.out.println(obj.hasTeen(20, 10, 13));

	}

	public boolean hasTeen(int a, int b, int c) {
		return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));

	}

}
