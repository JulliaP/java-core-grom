package lesson5;

import java.util.Arrays;

public class SortedArrays {

	public static void main(String[] args) {
		
		int [] array = {100, 1, 2, 56, 98};
		System.out.println(Arrays.toString(sortAscending(array)));
	}

	static int[] sortAscending(int[] array) {
		
		Arrays.sort(array);

		return array;
	}

	
}
  