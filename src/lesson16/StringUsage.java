package lesson16;

public class StringUsage {
    public static void main(String[] args) {

        // 1 variant

        String test = "someString";
        String result = test + " _end";

        System.out.println(result);

        // opredelenie string - string eto posledovatel'nost' char.
        // char v odinarnyx kavychkax, String v dvojnyx

        // 2 variant - kak mozhno sozdat' string
        char charVariable = 't';
        char charVariable1 = 'o';

        char[] chars = { charVariable, charVariable1 };

        String test1 = new String(chars);
        System.out.println(test1);

        // 3 variant - naprjamuju cherez kljuchevoe slovo new

        String test2 = new String("Hello string");
        System.out.println(test2);
    }

}
