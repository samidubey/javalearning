package com.codingbat.exercise1;

public class Problem11_FrontBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontBack("one"));
		System.out.println(frontBack("Samridhi"));
		System.out.println(frontBack(""));
		System.out.println(frontBackOldSchool("Deepak"));
		System.out.println(frontBackOldSchool("Me"));
		System.out.println(frontBackOldSchool(""));
	}

	public static String frontBack(String str) {

		if (str != null && !str.isEmpty()) {
			StringBuilder sb = new StringBuilder(str);
			char firstChar = sb.charAt(0);
			char lastChar = sb.charAt(str.length() - 1);
			sb.deleteCharAt(0);
			sb.insert(0, lastChar);
			sb.deleteCharAt(str.length() - 1);
			sb.insert(str.length() - 1, firstChar);
			String output = sb.toString();
			return output;
		}
		return str;
	}

	public static String frontBackOldSchool(String str) {

		if (str != null && !str.isEmpty()) {
			char firstChar = str.charAt(0);
			char lastChar = str.charAt(str.length() - 1);
			String middle = str.substring(1, str.length() - 1);
			String output = String.valueOf(lastChar) + middle + String.valueOf(firstChar);
			return output;

		}
		return str;
	}
}
