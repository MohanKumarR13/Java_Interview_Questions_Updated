package com.arraycoding;

import java.util.HashSet;

public class RemoveDuplicates
{
    
	public static void main(String[] args) {
		System.out.println("Hello World");
		HashSet<Integer>set=new HashSet<>();
		 int[] arr = {12, 35, 12, 24, 88, 35, 24};
		 for(int num:arr){
		     set.add(num);
		 }
		 System.out.println(set);

	}
}