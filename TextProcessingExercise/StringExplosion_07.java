package TextProcessingExercise;

import java.util.Arrays;
import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();


        String text = "";

        for (int i = 0; i < inputLine.length() - 1; i++) {
            char[] input = inputLine.toCharArray();
            if (input[i] == '>') {
                int digit = Integer.parseInt(String.valueOf(input[i + 1]));
                System.out.println(digit);
                String symbol = String.valueOf(input[i]);

                String start = inputLine.substring(0, i + digit + 1);
                String end = inputLine.substring(i + digit + 1, input.length - 1);
                String sub = start.concat(end);
                text = sub;
                inputLine = text;

            }
        }

        System.out.println(text);
    }
}
