package com.remove_junk;

public class Remove_Junk {

	public static void main(String[] args) {
		String str = "$%^#^%# !#$ Mobile Number 1234567890";
		String str_1 = "$%^#^%# !#$ Mobile Number @#$%&&^$##@@#%$%";
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		str_1 = str_1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str_1);
	}

}
