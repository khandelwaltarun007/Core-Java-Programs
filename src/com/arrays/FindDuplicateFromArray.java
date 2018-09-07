package com.arrays;

import java.util.HashSet;

public class FindDuplicateFromArray {

	public void findDuplicateFromArrayUsingBruteForceMethod(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					System.out.println("Duplicate value : " + array[i]);
				}
			}
		}
	}
	
	public void findDuplicateFromArrayWithCollections(int[] array) {
		HashSet<Integer> set = new HashSet<>();
		for(int value : array) {
			if(!set.add(value)) {
				System.out.println("Duplicate value : "+value);
			}
		}
	}
	
	public static void main(String[] args) {
		 int[] array = new int[] { 2, 3, 4, 2, 1, 3, 4, 7, 7, 8, 6 };
		//String[] array = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC" };
		FindDuplicateFromArray duplicateFromArray = new FindDuplicateFromArray();
		duplicateFromArray.findDuplicateFromArrayUsingBruteForceMethod(array);
		//duplicateFromArray.findDuplicateFromArrayWithCollections(array);
	}

}
