package com.string_reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse_String {
	public void usingBuffer() {
		String given = "Mohan";

		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		// Reverse the String Value
		System.out.println(buffer.reverse());

	}

	public void usigOwnLogic() {
		String given = "Mohan";
		char[] characterArray = given.toCharArray();
		String reversed = "";
		for (int i = characterArray.length - 1; i >= 0; i--) {
			reversed = reversed + characterArray[i];
		}
		System.out.println(reversed);
	}

	public void usingCollections() {
		String given = "Mohan";
		char[] characterArray = given.toCharArray();
		List<Character> list = new ArrayList<Character>();
		for (Character character : characterArray) {
			list.add(character);
		}
		Collections.reverse(list);
		ListIterator<Character> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
	}

	public static void main(String[] args) {
		Reverse_String reverse_String = new Reverse_String();
	 	reverse_String.usingBuffer();
		reverse_String.usigOwnLogic();
		reverse_String.usingCollections();
	}

}
