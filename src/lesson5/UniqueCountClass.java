package lesson5;

import java.util.Arrays;

public class UniqueCountClass {

	public static void main(String[] args) {
		int array[] = { 1, 4, 5, 4, 7 };
		System.out.println(uniqueCount(array));

	}

	static int uniqueCount(int[] array) {
		//1. Sort array ascending; 
		//2. Add int variable count to keep number of unique values;
		//3. Add variable i to find index.
		//4. Run through the array using for-loop; Compare every next element with the previous one, 
		//if they are not the same increase count;
		//5. First element of the array is a specific case  since there is no previous element for it 
		//and it is unique - increase count;Add if case for first element(i == 0)
		
		
		Arrays.sort(array);
		//System.out.println(Arrays.toString(array));
		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				count++;
			} else if (array[i] != array[i - 1]) {
				count++;
			}

			//System.out.println(count);
			
		}
		return count;

	}
}