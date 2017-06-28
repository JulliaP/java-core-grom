package lesson8.HomeWork;

public class TestClass {

	public static void main(String[] args) {
		int[] array = { 1, 3, 6 };
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

		if (maxEl + minEl > 100) {

			System.out.println("true");
		}
		System.out.println("false");
	}
}
