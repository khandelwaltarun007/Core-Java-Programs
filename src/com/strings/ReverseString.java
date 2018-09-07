package com.strings;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello this is the string";
		reverseWithoutMethods(str);
		reverseWithStringBuilder(str);
		reverseWordsFromString(str);
	}
	
	public static void reverseWordsFromString(String str) {
		String[] words = str.split("\\s+");
		String[] reverseString = new String[words.length];
		int counter = 0;
		for(String word : words) {
			String reverseWord = "";
			for(int i = word.length()-1; i>=0;i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			reverseString[counter] = reverseWord;
			counter++;
		}
		System.out.println(String.join(" ", reverseString));
	}
	
	public static void reverseWithStringBuilder(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());
	}
	
	public static void reverseWithoutMethods(String str) {
		String reverse = "";
		for(int i = str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
}
