package com.count_the_words;

import java.util.*;

public class CountWords {
	public static void main(String[] args) {
		String s = "MohanKumar R";
		String str[] = s.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (String c : str) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}