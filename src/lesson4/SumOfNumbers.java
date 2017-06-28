package lesson4;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		//System.out.println( sum(1, 3) );
				
	    //System.out.println( sum(3, 5) );
		
		//System.out.println( compareSums(1,3, 3,5) );
		
		compareSums(1,3, 3,5);

		
      	//System.out.println( compareSums(10,12, 1,2) );

	}

	// -- sum takes 2 values
	// public static int sum() {
	//   int from is 0st slot;
	//   int to   is 1nd slot 
	// }
	// 
	public static int sum(int from, int to) {
		int x = 0;
		
		for (int i = from; i <= to; i++) {
			x += i; // x = increment(x, i)

		}

		return x;
	}	
	
	public static boolean compareSums(int a, int b, int c, int d) {
		 int sum1 = sum(a, b);
		 int sum2 = sum(c, d);
		
		if (sum1 > sum2) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}

		//return 0;
	}
}
