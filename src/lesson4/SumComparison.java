package lesson4;

public class SumComparison {

	public static void main(String[] args) {

		compareSums(1, 3, 2147483646, 2147483647);

	}

	public static long sum(int from, int to) {
		long x = 0;

		for (long i = from; i <= to; i++) {
			x += i;
		}

		return x;
	}

	public static boolean compareSums(int a, int b, int c, int d) {
		long sum1 = sum(a, b);
		long sum2 = sum(c, d);

		if (sum1 > sum2) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}

	}
}
