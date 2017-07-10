package com.codingbat.exercise4;

import java.util.HashMap;
import java.util.Map;

public class Map1_MapShare {

	public static void main(String[] args) {

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "aaa");
		map1.put("b", "bbb");
		map1.put("c", "ccc");
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("a", "aaa");
		map2.put("c", "meh");
		map2.put("d", "hi");
		Map1_MapShare obj = new Map1_MapShare();
		System.out.println(obj.mapShare(map1));
		System.out.println(obj.mapShare(map2));
	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.remove("c");
		} else {
			map.remove("c");
		}
		return map;

	}

}
