package lesson5;

import java.util.Arrays;

public class TestClass {
	
	public static void main(String[] args){
		
		int [] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int count = 0;
		
		for (int i= 0;i< array.length;i++){
			if (i == 0) { 
				count++;
			}
			else if (array[i] != array[i-1]){
				count++;
			}
			
			System.out.println(count);
			// [ 4, 5, 10, 10, 11, 11, 11, 12, 44, 44, 100]
		}
	}
	

}
