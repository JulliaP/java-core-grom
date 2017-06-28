package lesson2;

public class SumAndDivision {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 1000; i++) {

			sum += i;
			System.out.println(sum);

		}

		int div = sum / 1234;
		System.out.println(div);

		int mod = sum % 1234;
		System.out.println(mod);

		boolean first = mod > div;
		System.out.println(first);

		boolean second = mod < div;
		System.out.println(second);
	}

}
