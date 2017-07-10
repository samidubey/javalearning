package com.codingbat.exercise2;

public class Problem1_StringTimes {

	public static void main(String[] args) {
		Problem1_StringTimes obj = new Problem1_StringTimes();
		System.out.println(obj.stringTimes("Hi", 2));
		System.out.println(obj.stringTimes("Hi", 3));
		System.out.println(obj.stringTimes("Hi", 1));
		System.out.println(obj.stringTimes("Hi", 0));
	}

	public String stringTimes(String str, int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			result = result + str;
		}
		return result;
	}
}
