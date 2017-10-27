package ru.surpavel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountStringChars {
    private static final char SPACE = ' ';

    private HashMap<String, String> inputsMap = new HashMap<>();

    public HashMap<String, String> getInputsMap() {
        return inputsMap;
    }

    private static int countOccurrences(String input, char character) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == character) {
                count++;
            }
        }
        return count;

    }

    public String count(String input) {
        if (input == null){
            throw new IllegalArgumentException("Argument can't be null");
        }
        if (inputsMap.containsKey(input)) {
            return inputsMap.get(input);
        }
        char[] inputChars = input.toCharArray();

        HashSet<String> set = new LinkedHashSet<>();

        for (char inputChar : inputChars) {
            if (inputChar != SPACE) {
                set.add(getExpression(input, inputChar));
            }
        }
        set.add(getExpression(input, SPACE));
        String expression = String.join("\n", set);
        inputsMap.put(input, expression);
        return expression;
    }

    private String getExpression(String input, char inputChar) {
        if (input.contains("" + inputChar)) {
            return "\"" + inputChar + "\" - " + countOccurrences(input, inputChar);
        } else {
            return "";
        }
    }
}
