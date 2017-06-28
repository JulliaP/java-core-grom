package lesson8.HomeWork;

public class Arithmetic {
	
	boolean sum(int a, int b, int c) {
		return (a + b + c) > 100;
	}

	boolean check(int[] array) {
		int maxEl = array[0];
		int minEl = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxEl) {
				maxEl = array[i];
			}
			
			if (array[i] < minEl) {
				minEl = array[i];
			}
		}
		
		//System.out.println(maxEl);

				
		//System.out.println(minEl);
				
		return (minEl + maxEl > 100);
		
				
		
		/*
		int sum = minEl + maxEl;
		boolean result = sum > 100; 
		
		// return true or false
		return result;
		*/
		
		
		//return false;
		
		/*
		 		if (result == true) {
			return true;
		}
		
		if (result == false) {
			return false;
		} 
		 */
	}
}
