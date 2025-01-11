package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int z = n;

        int sum = 1;
        int factorialSum = 0;

        while (n > 0) {

            int factorial = n % 10;
            for (int i = factorial; i >= 1 ; i--) {
                sum = sum * i;
            }
            factorialSum += sum;
            sum = 1;

            n = n / 10;
        }

        if (factorialSum == z) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
