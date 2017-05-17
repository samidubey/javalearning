package com.codingbat.exercise1;

public class Problem14_Front22 {

	public static void main(String[] args) {
		Problem14_Front22 obj = new Problem14_Front22();
		System.out.println(obj.front22("kitten"));
		System.out.println(obj.front22("ha"));
		System.out.println(obj.front22("abc"));
		System.out.println(obj.front22("a"));
	}

	public String front22(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		if (str.length() >= 3) {
			String startingTwoChar = str.substring(0, 2);
			String output = startingTwoChar + str + startingTwoChar;
			return output;
		}
		return str + str + str;
	}
}
