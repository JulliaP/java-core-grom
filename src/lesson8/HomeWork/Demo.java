package lesson8.HomeWork;

public class Demo {

	public static void main(String[] args) {
		
		Adder adder = new Adder();
		int[] array = {1,3,6};
		
		int x = 5;
		int y = 10;
		
		adder.add(x, y);
		adder.check(array);
	}
}


