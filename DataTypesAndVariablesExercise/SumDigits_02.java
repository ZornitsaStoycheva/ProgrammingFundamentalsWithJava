package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        System.out.print(sum);
    }
}
