package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String text = "";

        char[] symbol = input.toCharArray();

        for (int i = 0; i < symbol.length; i++) {
            int i1 = symbol[i] + 3;
            char s = (char) i1;
            text += s;
        }
        System.out.println(text);
    }
}
