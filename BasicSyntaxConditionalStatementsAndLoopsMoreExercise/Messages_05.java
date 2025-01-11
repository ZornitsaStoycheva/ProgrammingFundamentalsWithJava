package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String message = "";

        String[][] arr = {{"a", "b", "c"},
                            {"d", "e", "f"},
                            {"g", "h", "i"},
                            {"j", "k", "l"},
                            {"m", "n", "o"},
                            {"p", "q", "r", "s"},
                            {"t", "u", "v"},
                            {"w", "x", "y", "z"},
                            {" "}
                            };

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();

            int lengthInput = input.length();
            int num = Integer.parseInt(input);

            if (num % 10 == 0) {
                message += " ";
            } else {
                int lastDigit = num % 10;

                message += arr[lastDigit - 2][lengthInput - 1];
            }
        }

        System.out.println(message);
    }
}
