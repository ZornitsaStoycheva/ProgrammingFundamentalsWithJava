package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char input = scanner.nextLine().charAt(0);
            int digit = input;

            int sum = digit + key;
            char symbol = (char) sum;
            sb.append(symbol);
        }

        System.out.println(sb);
    }
}
