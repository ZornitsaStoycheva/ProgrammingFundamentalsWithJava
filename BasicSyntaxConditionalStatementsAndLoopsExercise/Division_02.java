package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Division_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String output = "The number is divisible by %d";

        if (n % 10 == 0) {
            System.out.printf(output, 10);
        } else if (n % 7 == 0) {
            System.out.printf(output, 7);
        } else if (n % 6 == 0) {
            System.out.printf(output, 6);
        } else if (n % 3 == 0) {
            System.out.printf(output, 3);
        } else if (n % 2 == 0) {
            System.out.printf(output, 2);
        } else {
            System.out.println("Not divisible");
        }
    }
}
