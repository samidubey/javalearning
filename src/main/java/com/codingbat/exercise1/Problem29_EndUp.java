package com.codingbat.exercise1;

public class Problem29_EndUp {

	public static void main(String[] args) {
		Problem29_EndUp obj = new Problem29_EndUp();
		System.out.println(obj.endUp("Hello"));
		System.out.println(obj.endUp("He"));
		System.out.println(obj.endUp("H"));
		System.out.println(obj.endUp("h"));
		System.out.println(obj.endUp("he"));

	}

	public String endUp(String str) {
		if (str.length() > 3) {
			String lastThreeChar = str.substring(str.length() - 3, str.length());
			return str.substring(0, str.length() - 3) + lastThreeChar.toUpperCase();
		}
		return str.toUpperCase();

	}

}
