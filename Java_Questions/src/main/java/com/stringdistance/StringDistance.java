package com.stringdistance;

import java.util.List;

public class StringDistance {
	  public static void main(String[] args) {
	        List<String> words = List.of("the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog");
	        String word1 = "quick";
	        String word2 = "lazy";

	        int distance = findMinDistance(words, word1, word2);
	        System.out.println(distance >= 0 ? "Minimum distance: " + distance : "One or both words not found.");
	    }

	    public static int findMinDistance(List<String> words, String word1, String word2) {
	        int index1 = -1, index2 = -1, minDistance = Integer.MAX_VALUE;

	        for (int i = 0; i < words.size(); i++) {
	            if (words.get(i).equals(word1)) {
	                index1 = i;
	                if (index2 != -1) {
	                    minDistance = Math.min(minDistance, index1 - index2);
	                }
	            } else if (words.get(i).equals(word2)) {
	                index2 = i;
	                if (index1 != -1) {
	                    minDistance = Math.min(minDistance, index2 - index1);
	                }
	            }
	        }

	        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
	    }
	}
