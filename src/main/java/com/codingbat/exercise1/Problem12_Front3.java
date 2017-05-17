package com.codingbat.exercise1;

public class Problem12_Front3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(front3("java"));
		System.out.println(front3("chocolate"));
		System.out.println(front3("abc"));
		System.out.println(front3(""));
		System.out.println(front3("ab"));
		System.out.println(front3("a"));

		System.out.println(front3OldSchool("Deepak"));
		System.out.println(front3OldSchool("Dee"));
		System.out.println(front3OldSchool(""));
		System.out.println(front3OldSchool("bc"));
		System.out.println(front3OldSchool("b"));

	}

	public static String front3(String str) {

		if (str != null && !str.isEmpty()) {
			StringBuilder sb = new StringBuilder(str);
			if (sb.length() >= 3) {
				sb.delete(3, sb.length());
				String firstThreeChar = sb.toString();
				sb.insert(0, firstThreeChar);
				String output = sb.toString() + firstThreeChar;
				return output;
			}
			return sb.toString() + sb.toString() + sb.toString();
		}
		return str;
	}

	public static String front3OldSchool(String str) {

		if (str != null && !str.isEmpty()) {
			if (str.length() >= 3) {
				String firstThreeChar = str.substring(0, 3);
				String output = firstThreeChar + firstThreeChar + firstThreeChar;
				return output;
			}
			return str + str + str;
		}
		return str;
	}

}
