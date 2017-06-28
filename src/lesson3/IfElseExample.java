package lesson3;

public class IfElseExample {
	public static void main(String[] args) {

		int test = 1000;
		if (test > 100) {
			System.out.println("Good");
		} else {
			System.out.println("Bad");
		}
		/*
		 * Syntax
		 * 
		 * if(condition -logical operator-condition2 ...ne bol'she 3 uslovij) { if-body } else{ else-body }
		 ** 
		 * condition inside is boolean, can be even harcoded to true or false,
		 * if-statement still would be working
		 */
		int test1 = 1001;
		boolean result = false;

		if (test1 > 1000) {
			result = true;
		}
		if (result)
			System.out.println("Nice");
		else {
			System.out.println("Fabulos");
		}
	}
}
