package lesson4;

public class StringConcatenation {

	public static void main(String[] args) {
		System.out.println(concat("Pust ", "vsegda budet ", "solnce"));
	}

	public static String concat(String first, String second, String third) {

		String result = first + second + third;

		return result;

	}
}
