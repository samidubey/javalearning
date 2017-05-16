package com.codingbat.exercise1;

public class Problem9_MissingChar {

	public static void main(String[] args) {
		System.out.println(missingChar("Kitten", 0));
		System.out.println(missingChar("Kitten", 1));
		System.out.println(missingChar("Kitten", 4));
		System.out.println(missingChar("Kitten", 5));
		System.out.println(missingChar("Kitten", 6));
		System.out.println("Kitten".length());
		System.out.println(missingCharOldSchool("Kitten", 4));
		System.out.println(missingCharOldSchool("Kitten", 5));
		System.out.println(missingCharOldSchool("Kitten", 6));
		System.out.println(missingCharPatiOldSchool("Kitten", 4));
		System.out.println(missingCharPatiOldSchool("Kitten", 5));
		System.out.println(missingCharPatiOldSchool("Kitten", 6));
	}

	public static String missingChar(String str, int n) {
		StringBuilder sb = new StringBuilder(str);
		if (n <= str.length() - 1) {
			sb.deleteCharAt(n);
			String output = sb.toString();
			return output;
		}
		return str;
	}

	public static String missingCharOldSchool(String str, int n) {
		if (n <= str.length() - 1) {
			String front = str.substring(0, n);
			String Back = str.substring(n + 1, str.length());
			String output = front + Back;
			return output;
		}
		return str;

	}

	public static String missingCharPatiOldSchool(String str, int n) {
		String output = "";
		if (n <= str.length() - 1) {
			for (int i = 0; i <= str.length() - 1; i++) {
				if (i != n) {
					output = output + String.valueOf(str.charAt(i));
				}
			}
			return output;
		}
		return str;
	}
}
