package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String reverseWord = "";
        char symbol;

        for (int i = word.length() - 1; i >= 0; i--) {
            symbol = word.charAt(i);
            reverseWord += symbol;
        }
        System.out.println(reverseWord);
    }
}
