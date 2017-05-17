package com.codingbat.exercise1;

public class Problem13_BackAround {

	public static void main(String[] args) {
		Problem13_BackAround obj = new Problem13_BackAround();
		System.out.println(obj.backAround("cat"));
		System.out.println(obj.backAround("Hello"));
		System.out.println(obj.backAround("a"));
		System.out.println(obj.backAroundOldSchool("dog"));
		System.out.println(obj.backAroundOldSchool("Hallo"));
		System.out.println(obj.backAroundOldSchool("v"));
	}

	public String backAround(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		StringBuilder sb = new StringBuilder(str);

		char lastChar = sb.charAt(str.length() - 1);
		sb.insert(0, lastChar);
		sb.insert(str.length(), lastChar);
		String output = sb.toString();
		return output;
	}

	public String backAroundOldSchool(String str) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		char lastChar = str.charAt(str.length() - 1);
		String output = String.valueOf(lastChar) + str + String.valueOf(lastChar);
		return output;

	}
}
