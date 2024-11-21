package com.find_number_of_vowels;

import java.util.*;

public class Vowels {
	public static void main(String[] args) {
		String s = "MohanKumar13";
		s = s.toLowerCase();
		System.out.println(s);
		int vowelCount = 0;
		int others = 0;
		int consCount = 0;
		char ch[] = s.toCharArray();
		HashMap<Character, Integer> Vmap = new HashMap<>();
		HashMap<Character, Integer> Cmap = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				Vmap.put(c, Vmap.getOrDefault(c, 0) + 1);
				vowelCount++;
				ch[i] = '*';
			} else if (c >= 'a' && c <= 'z') {
				Cmap.put(c, Cmap.getOrDefault(c, 0) + 1);
				consCount++;
			} else {
				others++;
			}
		}
		System.out.println("Print Vowels Character");
		for (Map.Entry<Character, Integer> entry : Vmap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("Print Consonants Character");

		for (Map.Entry<Character, Integer> entry : Cmap.entrySet()) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("Print Duplicate Character");
		for (Map.Entry<Character, Integer> entry : Cmap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println("Vowels Characters=>");

		for (Map.Entry<Character, Integer> entry : Cmap.entrySet()) {
			System.out.println(entry.getKey());
		}
		System.out.println("Consonants Characters=>");

		for (Map.Entry<Character, Integer> entry : Cmap.entrySet()) {
			System.out.println(entry.getKey());
		}
		System.out.println("Total No Of Vowels " + vowelCount);
		System.out.println("Total No Of Consonants " + consCount);
		System.out.println("Other characters count: " + others);
		System.out.println("Modified String " + new String(ch));
	}
}