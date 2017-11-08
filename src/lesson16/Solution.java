package lesson16;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String text = "hello test yxg test hello hello";
        // hello test yxg test hello hello

        int count = countWords(text);
        String max = maxWord(text);
        String min = minWord(text);

        System.out.println("countWords " + count);
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println(mostCountedWord(text) + " is the most repetable word");
    }

    public static int countWords(String input) {

        String[] words = input.split(" ");

        int res = 0;
        for (String w : words) {
            if (validWord(w)) {
                res++;
            }
        }

        System.out.println(res);
        return res;

    }

    static String maxWord(String input) {

        String[] words = input.split(" ");

        // esli array pustoj
        if (words.length == 0) {
            return null;
        }
        // esli vsego odin element v msassive - verni pervyj
        if (words.length == 1) {
            return words[0];
        }

        /*
         * for (String w : words) { if (!validWord(w)) { return null; } }
         */

        String res = words[0];

        for (int i = 1; i < words.length; i++) {
            String current = words[i];

            if (!validWord(current)) {
                continue;
            }

            if (!validWord(res) || (current.length() > res.length())) {
                res = current;
            }
        }

        if (!validWord(res)) {
            return null;
        }

        return res;
    }

    static String minWord(String input) {

        String[] words = input.split(" ");

        if (words.length == 0) {
            return null;
        }

        if (words.length == 1) {
            return words[0];
        }

        String res = words[0];

        for (int i = 1; i < words.length; i++) {

            String current = words[i];

            if (!validWord(current)) {
                continue;
            }

            if (!validWord(res) || (current.length() < res.length())) {
                res = current;
            }
        }

        if (!validWord(res)) {
            return null;
        }

        return res;
    }

    // if ((current.length() != 0) && (res.length() == 0 || current.length() < res.length())) { // res = current; //

    public static String mostCountedWord(String input) {
        // 1. Vvesti chetyre peremennye res(samoe populjarnoe slovo) i resCount, current i currentCount
        // 2. Probezhat' på array ispolzuja dva vlozhennyx for-each loopa, kazhdyj raz kogda nahoditsja povtorenie,
        // uvelichivat' currentCount
        // 3. Kazhdyj raz kogda currentCount stanovitsja bol'she resCount, prisvaivat' resCount zhachenie currentCount

        String[] words = input.split(" ");

        String res = null;
        int resCount = 0;

        // [test, hello, yxg, test, hello, hello]
        for (String current : words) {
            int currentCount = 0;
            if (!validWord(current)) {
                continue;
            }

            // [test, hello, yxg, test, hello, hello]
            for (String word : words) {
                if (current.equals(word)) {
                    currentCount += 1;
                }
            }

            if (res == null || (currentCount > resCount)) {
                res = current;
                resCount = currentCount;
            }
        }

        return res;
    }

    private static boolean validWord(String word) {
        if (word.isEmpty()) {
            return false;
        }

        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c)) { // esli proverka ne prohodit, vozvrashaem false return false; }
                return false;
            }
        }

        return true;
    }
}
