package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] value = input.toCharArray();

        String text = String.valueOf(value[0]);

        int counter = 0;

        while (value.length - 1 > counter) {

            if (value[counter] != value[counter + 1]) {
                text += value[counter + 1];
            }

            counter++;
        }

        System.out.println(text);
    }
}
