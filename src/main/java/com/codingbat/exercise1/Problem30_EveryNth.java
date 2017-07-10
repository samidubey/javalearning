package com.codingbat.exercise1;

public class Problem30_EveryNth {

	public static void main(String[] args) {
		Problem30_EveryNth obj = new Problem30_EveryNth();
		System.out.println(obj.everyNth("Miracle", 2));
		System.out.println(obj.everyNth("abcdefg", 2));
		System.out.println(obj.everyNth("abcdefg", 3));
	}

	public String everyNth(String str, int n) {
		String result = "";
		for (int i = 0; i < str.length();) {
			result = result + String.valueOf(str.charAt(i));
			i += n;
		}
		return result;
	}

}
