package com.strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateLettersAndWordsFromString {
	public static void main(String[] args) {
		String str = "This sentence contains two words, one and two";
		System.out.println("Duplicate characters : "+printDuplicateLetters(str));
		System.out.println("Duplicate words : "+printDuplicateWords(str));
	}

	public static Set<String> printDuplicateWords(String str){
		if (str == null || str == "")
			return Collections.emptySet();
		Set<String> set = new HashSet<>();
		String[] words = str.split("\\s+");
		Set<String> duplicate = new HashSet<>();
		for(String word : words) {
			if(!set.add(word)) {
				duplicate.add(word);
			}
		}
		return duplicate;
	}
	
	public static Set<Character> printDuplicateLetters(String str) {
		if (str == null || str == "")
			return Collections.emptySet();
		
		Set<Character> set = new HashSet<>();
		Set<Character> duplicate = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (!set.add(ch)) {
				duplicate.add(ch);
			}
		}
		return duplicate;
	}
}
