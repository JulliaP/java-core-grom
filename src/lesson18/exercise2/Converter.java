package lesson18.exercise2;

public class Converter {

    public static void main(String[] args) {
        // Napisat' metod, kotoryj vhodjashee celoe chislo budet konvertirovat' v stroku i naoborot

        System.out.println(intToString(111231));
        System.out.println(stringToInt("11"));

        System.out.println(stringToInt("1050a"));

        System.out.println(intToString(111231));
        System.out.println(stringToInt("11"));

    }

    public static String intToString(int input) {

        return String.valueOf(input);
    }

    public static int stringToInt(String input) {
        try {
            return Integer.parseInt(input);
            // zapomnit' - v catch starat'sja pisat' bolee tochnuju oshibku
            // (naprimer ne prosto Exception a NumberFormatException)
            // Exception konechno tozhe rabotaet, no eto horoshaja policy
        } catch (NumberFormatException | ClassCastException e) {
            // mozhno napisat' dva vida exception kak v primere vyshe. Mozhno i tri i bol'she, no kak
            // pravilo ogranichivajutsja dvumja. Esli kolichestvo potencialnyh exceptionov bolshe dvux,
            // pishut prosto Exception)
            System.out.println(input + " can not be convrted to int");
            return 0;
        }
    }
}
