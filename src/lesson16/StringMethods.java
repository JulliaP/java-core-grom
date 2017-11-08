package lesson16;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String test = "someStringExample";

        System.out.println(test.isEmpty());
        System.out.println("".isEmpty());
        System.out.println(test.length());
        System.out.println(test.charAt(2));

        String res = test.replaceAll("me", "T");
        System.out.println(res);

        System.out.println(test.replace("me", "t"));

        System.out.println(test);

        System.out.println(test.contains("mes"));

        System.out.println(test);
        String phrase = "Hello there guys";
        System.out.println(Arrays.toString(phrase.split(" ")));
        // trim udaljaet probely v nachale i konce
        System.out.println(" test a".trim());
        // substring - metod, kot vozvrashaet chast' stringa
        // (kakuju imenno my opredeljaem v parametrax)

        System.out.println(phrase.substring(5));
        System.out.println(phrase.substring(5, 10).trim());

        System.out.println(test.toUpperCase());
        System.out.println(test.toLowerCase());

        test.equals("eee");
        test.intern();

        test.getBytes();

    }

}
