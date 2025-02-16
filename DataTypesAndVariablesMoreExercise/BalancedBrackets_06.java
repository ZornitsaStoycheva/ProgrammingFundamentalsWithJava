package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int opened = 0;
        int closed = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                opened ++;
            } else if (input.equals(")")) {
                closed ++;
            }

            if (closed > opened) {
                System.out.println("UNBALANCED");
                return;
            }
        }

        if (opened == closed) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
