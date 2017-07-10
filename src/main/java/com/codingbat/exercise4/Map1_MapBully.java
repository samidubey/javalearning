package com.codingbat.exercise4;

import java.util.HashMap;
import java.util.Map;

public class Map1_MapBully {

	public static void main(String[] args) {
		Map1_MapBully obj = new Map1_MapBully();
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "candy");
		map1.put("b", "dirt");
		System.out.println(obj.mapBully(map1));

	}

	public Map<String, String> mapBully(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}

		return map;

	}

}
