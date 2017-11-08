package lesson19;

public class ThrowExample {

    private static String[] array = { "test", "test1", "testqwd", null, "adsasf", "sdfsdf" };

    public static void main(String[] args) {
        // test();

        useOfTestMethod();
    }

    // v metode test ja hochu probezhat po massivu i esli est' null,
    // to vybrasyvat' oshibku
    // poskolku RuntimeException ne otnisitsja k "checked exceptions", to mozhno prosto dobavit' komandu throw
    // RuntimeException
    //
    private static void test() {
        for (String element : array) {
            if (element == null) {
                throw new RuntimeException("null is detected");
            }
            System.out.println("done");
        }
    }

    private static void useOfTestMethod() {
        try {
            test();

        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());

        }

    }
}
