package lesson18.HomeWork;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findNumbers("  123 12%4 89a 83# 709")));
        // 123 12%4 89a 83# 709
    }

    public static int[] findNumbers(String text) {

        String[] words = text.split(" ");
        int[] chisla = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            try {
                chisla[i] = Integer.parseInt(words[i]);
            } catch (Exception e) {
                System.out.println(words[i] + "not a number");
            }
        }

        /*
         * try { return Integer.parseInt(words); } catch (Exception e) { System.out.println(input + "not a number");
         */
        return chisla;
    }
}
