package com.arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = new int[] { 12, 10, 14, 43, 24, 74, 23 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
