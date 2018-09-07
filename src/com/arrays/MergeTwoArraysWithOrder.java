package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeTwoArraysWithOrder {

	public void mergeTwoArrayWithOrderByLoop(int[] array1, int[] array2) {
		int length = array1.length + array2.length;
		int[] array3 = new int[length];
		int counter = 0;
		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
			counter++;
		}
		for (int i = 0; i < array2.length; i++) {
			array3[counter++] = array2[i];
		}
		Arrays.sort(array3);
		System.out.println(Arrays.toString(array3));
	}

	public void mergeTwoArrayWithOrderByCollections(int[] array1, int[] array2) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < array1.length; i++) {
			list.add(array1[i]);
		}
		for (int i = 0; i < array2.length; i++) {
			list.add(array2[i]);
		}

		Collections.sort(list);
		System.out.println(list);
	}

	public static void main(String[] args) {
		MergeTwoArraysWithOrder mergeTwoArraysWithOrder = new MergeTwoArraysWithOrder();
		int[] array1 = new int[] { 1, 2, 3, 4 };
		int[] array2 = new int[] { -1, -2, -3 };
		mergeTwoArraysWithOrder.mergeTwoArrayWithOrderByCollections(array1, array2);
	}

}
