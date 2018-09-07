package com.strings;

import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String str, String str1) {
		char[] char1 = str.replace("\\s", "").toCharArray();
		char[] char2 = str1.replace("\\s", "").toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.equals(char1, char2);
		
	}
	
	public static void main(String[] args) {
		String str = "listen";
		String str1 = "slient";
		System.out.println(anagram(str, str1));
		
		
	}
}
