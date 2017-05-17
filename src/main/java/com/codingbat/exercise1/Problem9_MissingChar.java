package com.codingbat.exercise1;

public class Problem9_MissingChar {

	public static void main(String[] args) {
		Problem9_MissingChar obj = new Problem9_MissingChar();

		System.out.println(obj.missingChar("Kitten", 0));
		System.out.println(obj.missingChar("Kitten", 1));
		System.out.println(obj.missingChar("Kitten", 4));
		System.out.println(obj.missingChar("Kitten", 5));
		System.out.println(obj.missingChar("Kitten", 6));
		System.out.println("Kitten".length());
		System.out.println(obj.missingCharOldSchool("Kitten", 4));
		System.out.println(obj.missingCharOldSchool("Kitten", 5));
		System.out.println(obj.missingCharOldSchool("Kitten", 6));
		System.out.println(obj.missingCharPatiOldSchool("Kitten", 4));
		System.out.println(obj.missingCharPatiOldSchool("Kitten", 5));
		System.out.println(obj.missingCharPatiOldSchool("Kitten", 6));
	}

	public String missingChar(String str, int n) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		if (n >= 0 && n <= str.length() - 1) {
			StringBuilder sb = new StringBuilder(str);
			sb.deleteCharAt(n);
			String output = sb.toString();
			return output;
		}
		return str;
	}

	public String missingCharOldSchool(String str, int n) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		if (n >= 0 && n <= str.length() - 1) {
			String front = str.substring(0, n);
			String Back = str.substring(n + 1, str.length());
			String output = front + Back;
			return output;
		}
		return str;

	}

	public String missingCharPatiOldSchool(String str, int n) {
		if (str == null || str.isEmpty()) {
			return "";
		}
		String output = "";
		if (n >= 0 && n <= str.length() - 1) {
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
