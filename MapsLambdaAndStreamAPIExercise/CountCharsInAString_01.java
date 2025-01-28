package MapsLambdaAndStreamAPIExercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Map<Character, Integer> text = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            String word = input[i];

            for (int j = 0; j < word.length(); j++) {
                char symbol = word.charAt(j);

                if (!text.containsKey(symbol)) {
                    text.put(symbol, 1);
                } else {
                    text.put(symbol, text.get(symbol) + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : text.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
