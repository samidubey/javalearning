package com.codingbat.exercise6;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	static String compress(String str) {
		if (str.length() == 0) {
			return "";
		}
		String compressed = "";
		while (str.length() != 0) {
			String firstChar = str.charAt(0) + "";
			String pattern = "^([" + firstChar + "]*)";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(str);
			m.find();
			String matched = m.group(1);
			int matchedLength = matched.length();
			str = str.replaceFirst(matched, "");
			compressed = compressed + firstChar + (matchedLength > 1 ? matchedLength : "");
		}
		return compressed;
	}

	public static void main(String[] args) {
		System.out.println(compress("aaabbcbb"));
	}

	static String pallindrome(String s) {

		Map<Character, Integer> charOccurrences = new HashMap<>();

		for (char c : s.toCharArray()) {

			if (charOccurrences.containsKey(c)) {
				charOccurrences.put(c, charOccurrences.get(c) + 1);
			} else {
				charOccurrences.put(c, 1);
			}
		}

		// For pallindrone, there can be at max one char with odd occurrence.
		// Two chars with odd occurrence cannot make a pallindrome
		int oddCharOccurrenceCount = 0;
		for (char c : charOccurrences.keySet()) {
			int charCount = charOccurrences.get(c);
			if (charCount % 2 != 0) {
				oddCharOccurrenceCount++;
			}

			if (oddCharOccurrenceCount > 1) {
				return "NO";
			}
		}

		return "YES";
	}

}
