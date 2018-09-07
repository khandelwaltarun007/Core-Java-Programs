package com.strings;

public class StringPermutation {
	public static void main(String[] args) {
		permutation("", "123");
	}

	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);

		} else {
			for (int i = 0; i < word.length(); i++) {
				System.out.println("Perm at "+i+" : "+perm + word.charAt(i));
				System.out.println("Word at "+i+" : "+word.substring(0, i) + word.substring(i + 1, word.length()));
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}

		
	}
}
