package lesson5;

import java.util.Arrays;

public class SortArrayManually {

	public static void main(String[] args) {

		int[] array = { 100, 1, 2, 56, 98 };
		System.out.println(Arrays.toString(sortAscending(array)));
		System.out.println(Arrays.toString(sortDescending(array)));

	}

	static int[] sortAscending(int[] array) {

		// 1. Add two variables i and j to compare each pair of array.

		for (int i = 0; i <= array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// 2.Compare each pair. Add third intermediate variable to keep
				// temp value for swap
				int temp;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		return array;
	}

	static int[] sortDescending(int[] array) {

		// 1. Add two variables i and j to compare each pair of array.

		for (int i = 0; i <= array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// 2.Compare each pair. Add third intermediate variable to keep
				// temp value for swap
				int temp;
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}
		return array;
	}

}
