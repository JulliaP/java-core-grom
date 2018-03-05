package lesson31;

import java.util.TreeMap;

import lesson30.ITCompanies.Position;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public Map<Character, Integer> countSymbols(String text) {

        Map<Character, Integer> NumberOfRepeatedChars = new TreeMap<>();
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {

            char ch = text.charAt(i);
            ch = Character.toUpperCase(ch);
            if (Character.isLetter(ch)) {
                if (NumberOfRepeatedChars.containsKey(ch)) {

                    int repeats = NumberOfRepeatedChars.get(ch);
                    NumberOfRepeatedChars.put(ch, ++repeats);

                } else {

                    NumberOfRepeatedChars.put(ch, 1);
                }

            }

        }
        System.out.println(NumberOfRepeatedChars);
        return NumberOfRepeatedChars;
    }

    public Map<String, Integer> words(String text) {

        Map<String, Integer> NumberOfRepeatedWords = new HashMap<>();

        String[] splitedIntoWords = text.split(" ");

        for (String sp : splitedIntoWords) {
            boolean isWord = checkIfSpWord(sp);

            if (isWord) {
                String word = sp.toUpperCase();
                if (NumberOfRepeatedWords.containsKey(word)) {

                    int repeats = NumberOfRepeatedWords.get(word);
                    NumberOfRepeatedWords.put(word, ++repeats);
                } else {

                    NumberOfRepeatedWords.put(word, 1);
                }
            }
        }
        System.out.println(NumberOfRepeatedWords);
        return NumberOfRepeatedWords;
    }

    private boolean checkIfSpWord(String something) {
        boolean isLetter = isLetter(something);

        if (something.length() > 2 && (isLetter)) {

            System.out.println("Yes, it's a word");
            return true;
        }

        System.out.println("No, " + something + " is not a word");
        return false;
    }

    public boolean isLetter(String something) {
        return something.matches("[a-zA-Z]+");
    }
}
