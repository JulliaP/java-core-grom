package lesson18.HomeWork;

import java.util.Arrays;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumbers("  123 12%4 89a 83# 709")));
        // 123 12%4 89a 83# 709
    }

    public static int[] findNumbers(String text) {

        String[] words = text.split(" ");
        int[] chisla = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            if (validInteger(words[i])) {
                chisla[i] = Integer.parseInt(words[i]);
            }

            System.out.println(words[i] + "not a number");
        }
        return chisla;
    }

    /*
     * try { return Integer.parseInt(words); } catch (Exception e) { System.out.println(input + "not a number");
     */

    private static boolean validInteger(String word) {
        if (word.isEmpty()) {
            return false;
        }

        for (char c : word.toCharArray()) {
            if (!Character.isDigit(c)) { // esli proverka ne prohodit, vozvrashaem false return false; }
                return false;
            }
        }

        return true;
    }
}