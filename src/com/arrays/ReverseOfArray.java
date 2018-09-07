package com.arrays;

import java.util.Arrays;

public class ReverseOfArray {

	public static void printReverse(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + ",");
		}
	}

	public static void reverseArrayWithoutAnotherArray(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void reverseArrayWithAnotherArray(int[] array) {
		int[] reverseArray = new int[array.length];
		int counter = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			reverseArray[counter++] = array[i];
		}
		System.out.println(Arrays.toString(reverseArray));
	}

	public static void main(String[] args) {
		int[] array = new int[] { 12, 23, 34, 45, 56, 67, 22, 65 };
		reverseArrayWithoutAnotherArray(array);
		reverseArrayWithoutAnotherArray(array);
		printReverse(array);
	}
}
