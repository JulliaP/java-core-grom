package lesson19;

public class RuntimeExceptionExample {

    public static void main(String[] args) {

        // arithmetic exception
        arithmeticException(2);

        try {
            arithmeticException(0);

        } catch (ArithmeticException e) {

            System.out.println("something is wrong");
        }

        // imitiruem NullPointerException
        npe(new Object());
        npe(null);
    }

    private static void arithmeticException(int a) {
        System.out.println(10 / a);
    }

    // Zapubit' na nosu -try-catch'em nullPointerException obrabatyvat' nel'zja
    // Nizhe primer, chto takoj varian rabotaet, no tak nikto ne delaet
    private static void npe(Object object) {
        try {
            System.out.println(object.hashCode());
        } catch (NullPointerException e) {
            System.out.println("Tak nikto ne delaet, xotja rabotaet");
        }

        // na samom dele dlja obrabotki NullPointerException nado ispol'zovat' If.
        // V chem raznica etix dvux metodov ? Try-catch slishkom gromozdkij sposob obrabotki NullPOinterException

        if (object != null) {

            System.out.println(object.hashCode() + "eto iz if");
        }
    }
}
