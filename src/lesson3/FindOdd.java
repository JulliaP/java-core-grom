package lesson3;

public class FindOdd {

	public static void main(String[] args) {
		int sum=0;
		
		for (int x=0; x<= 1000;x++)
		{
	 if ( !(x % 2 == 0) ) {
		System.out.println(" Found");
		 sum += x;
		}  
				
	}
		if (sum * 5 > 5000) {
			
			System.out.println("Bigger");
			
		}
		else {System.out.println("Smaller or equal");}
			
}
	}
