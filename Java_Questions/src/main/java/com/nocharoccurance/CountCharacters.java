package com.nocharoccurance;

import java.util.*;
public class CountCharacters
{
	public static void main(String[] args) {
	    String s="Mohan";
	    char ch[]=s.toCharArray();
	    HashMap<Character,Integer>map=new HashMap<>();
	    for(char c:ch){
	        if(c!=' ')
	        if(map.containsKey(c)){
	            map.put(c,map.get(c)+1);
	        }else{
	            map.put(c,1);
	        }
	    }
	    for(Map.Entry entry:map.entrySet()){
	        System.out.println(entry.getKey()+" "+entry.getValue());
	    }
	}
}