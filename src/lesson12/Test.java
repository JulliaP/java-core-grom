package lesson12;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println(Currency.EUR);
        System.out.println(Arrays.toString(Currency.values()));
        String usd = "USD";
        Currency usdConverted = Currency.valueOf(usd);
        // valueOf - This method returns the enum constant of the specified enum type with the specified name.
        System.out.println(usdConverted);

    }

}
