package com.codingbat.exercise6;

public class String3_withoutString {

	public static void main(String[] args) {
		String3_withoutString obj = new String3_withoutString();
		// System.out.println(obj.withoutString("hello there", "llo"));
		// System.out.println(obj.withoutString("hello there", "e"));
		// System.out.println(obj.withoutString("hello there", "x"));
		System.out.println(obj.withoutString("THIS is a FISH", "iS"));

	}

	public String withoutString(String base, String remove) {
		String s1 = "";
		String result = "";
		if (!base.isEmpty()
				&& (base.contains(remove.toLowerCase()) == true || base.contains(remove.toUpperCase()) == true)) {
			for (String s : base.split("[^a-zA-Z0-9]")) {
				// String sUpper = s.toLowerCase();
				String slower = s.toLowerCase();
				// s1 = sUpper.replaceAll("[" + remove.toUpperCase() + "]", "");
				s1 = slower.replaceAll("[" + remove.toLowerCase() + "]", "");
				result = result + " " + s1.trim();
			}

			return result.trim();
		}
		return base;
	}
}
