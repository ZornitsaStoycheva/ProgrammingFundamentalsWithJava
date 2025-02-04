package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MorseCodeTranslator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+//|\\s+");

        String[][] morse =  {
                {"A", ".-"},
                {"B", "-..."},
                {"C", "-.-."},
                {"D", "-.."},
                {"E", "."},
                {"F", "..-."},
                {"G", "--."},
                {"H", "...."},
                {"I", ".."},
                {"J", ".---"},
                {"K", "-.-"},
                {"L", ".-.."},
                {"M", "--"},
                {"N", "-."},
                {"O", "---"},
                {"P", ".--."},
                {"Q", "--.-"},
                {"R", ".-."},
                {"S", "..."},
                {"T", "-"},
                {"U", "..--"},
                {"V", "...-"},
                {"W", ".--"},
                {"X", "-..-"},
                {"Y", "-.--"},
                {"Z", "--.."},
        };


        String decodedText = "";
        int counter = 0;

        for (int i = 0; i < input.length; i++) {

            for (int j = 0; j < morse.length; j++) {
                String text = morse[j][1];
                String decode = morse[j][0];

                String symbol = input[i];

                if (text.equals(symbol)) {
                    decodedText += decode;
                    break;
                }

                if (symbol.equals("|")) {
                    decodedText += " ";
                    break;
                }
                counter++;
            }

        }

        System.out.println(decodedText);
    }
}
