package lesson17;

import java.util.Arrays;

public class Exercises {

    public static void main(String[] args) {
        String test = "There is Test something new or jot sdf sdf sdf word Test op or ";
        System.out.println(deleteDuplicates(test));
        System.out.println(Arrays.toString(countDuplicates(test, new String[] { "or", "some", "test" })));

        /*
         * String str = "Today is good day... Hello"; //da -> ppppppppp
         * 
         * System.out.println(replace(str, "is", "that")); System.out.println(replace(str, "o", " "));
         * System.out.println(replace(str, "To", "pppp")); System.out.println(replace(str, "lo", "X"));
         */
    }

    public static String deleteDuplicates(String input) {

        // chto nuzhno sdelat' - nuzhno najti povtorenija i udalit' ix

        String[] words = input.split(" ");

        // Esli my sravnivaem vse elementy array
        // mezhdu soboj - my ispolzuem dvojnoi cycle For, gde i=0, a j =i+1;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    words[j] = "";
                }
            }
        }

        String res = "";
        // Nizhe dobavljaem for dlja togo chtoby perepisat' slova v words
        // s probelom posle kazhdogo nepustogo znachenija

        for (String word : words) {
            res += word;
            if (!word.isEmpty()) {
                res += " ";
            }
        }

        return res;

    }

    public static int[] countDuplicates(String input, String[] words) {
        String[] strings = input.split(" ");
        int[] res = new int[words.length];
        // probegaem po massivu strings, i kazhdoe slovo sravnivaem so slovami v massive words
        for (String string : strings) {
            for (int i = 0; i < words.length; i++) {
                if (string.equals(words[i])) {
                    res[i]++;
                }
            }

        }
        return res;
    }
}
/*
 * public static String replace(String input, String target, String replacement) { //najti gde vozmozhna zamena
 * //proverit' zamenu //esli ok - zamenit'
 * 
 * int [] indexes = findStartIndexes(input.toCharArray(), target.charAt(0));
 * 
 * if(indexes.length == 0) return input;
 * 
 * for (int index: indexes){ if (checkReplace(input, target, index)){ char[] res1 = new char[index];
 * 
 * for(int i= 0; i < index; i++){ res1[i] = input.toCharArray()[i];
 * 
 * char[] res3 = new char[input.length() - res1.length - target.length()]; for(int i = 0, j = res1.length
 * +target.length();i< res3.length && j < input.length(); i++) res3[i] = input.toCharArray()[j]; } return new
 * String(res1) + replacement + new String(res3);
 * 
 * } private static boolean checkReplace(String input, String target, int index){ char[] inputChars=
 * input.toCharArray(); char[] replaceChars = target.toCharArray();
 * 
 * for (int i= 0; i < replaceChars.length && index < inputChars.length; i++, index++ ){ if (inputChars[index] !=
 * replaceChars[i]){ return false; } } return true; } private static int[] findStartIndexes(char[] inputChars, char
 * beginningChar){ int count = 0; for(char ch:inputChars){ if (ch == beginningChar ){ indexes[in] = index; in++; } } } }
 * return null;
 * 
 * } }
 */