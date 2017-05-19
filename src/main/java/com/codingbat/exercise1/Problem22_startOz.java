package com.codingbat.exercise1;

import java.util.Optional;

public class Problem22_startOz {

	public static void main(String[] args) {
		Problem22_startOz obj = new Problem22_startOz();
		System.out.println(obj.startOz("ozymandias"));
		System.out.println(obj.startOz("bzoo"));
		System.out.println(obj.startOz("oxx"));
		System.out.println(obj.startOz(""));
		System.out.println(obj.startOz("oz"));
		System.out.println(obj.startOz("om"));
		System.out.println(obj.startOz("mz"));
		System.out.println(obj.startOz("ab"));
		System.out.println(obj.startOz("b"));

	}

	public String startOz(String str) {
		String str1 = Optional.ofNullable(str).orElse("");
		String result = "";
		if (str1.length() >= 1 && str1.charAt(0) == 'o') {
			result = result + str1.charAt(0);
		}

		if (str1.length() >= 2 && str1.charAt(1) == 'z') {
			result = result + str1.charAt(1);
		}

		return result;
	}

}
