package com.codingbat.exercise1;

public class Problem14_Front22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem14_Front22 obj = new Problem14_Front22();
		System.out.println(obj.Front22("kitten"));
		System.out.println(obj.Front22("ha"));
		System.out.println(obj.Front22("abc"));
		System.out.println(obj.Front22("a"));
	}

	public String Front22(String str) {
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
