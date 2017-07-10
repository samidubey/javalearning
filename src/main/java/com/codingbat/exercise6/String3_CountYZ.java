package com.codingbat.exercise6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3_CountYZ {

	public static void main(String[] args) {
		String3_CountYZ obj = new String3_CountYZ();
		System.out.println(obj.countYZ("yoy yez"));
		System.out.println(obj.countYZ("day fez"));
		System.out.println(obj.countYZ("day fyyyz"));
		System.out.println(obj.countYZWithoutregex("day fyyyz"));
		System.out.println(obj.countYZWithoutregex("day fyyyz"));
		System.out.println(obj.countYZWithoutregex("day fyyyz"));
	}

	public int countYZ(String str) {
		int result = 0;
		String pattern = "([a-zA-Z]+)";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);

		String pattern1 = "[yzYZ]$";
		Pattern p1 = Pattern.compile(pattern1);

		while (m.find()) {
			String word = m.group(1);
			Matcher m1 = p1.matcher(word);
			if (m1.find() == true) {
				result++;
			}

		}
		return result;
	}

	public int countYZWithoutregex(String str) {
		int count = 0;
		for (String s : str.split("[^a-zA-Z]")) {
			if (!s.isEmpty() && (s.charAt(s.length() - 1) == 'y' || s.charAt(s.length() - 1) == 'z'
					|| s.charAt(s.length() - 1) == 'Y' || s.charAt(s.length() - 1) == 'Z')) {
				count++;
			}

		}
		return count;

	}

}
