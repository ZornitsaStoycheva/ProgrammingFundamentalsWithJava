package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class TriangleOfNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        for (int i = 1; i <= n ; i++) {
            String words = "";
            words = Integer.toString(i) + " ";
            System.out.printf("%s %n", words.repeat(i));
        }
    }
}
