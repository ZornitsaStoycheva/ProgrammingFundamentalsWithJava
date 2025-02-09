package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumbers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {

            int digit = i;
            int sumDigit = 0;

            while (digit > 0) {
                sumDigit += digit % 10;
                digit = digit / 10;
            }

            if (sumDigit == 5 || sumDigit == 7 || sumDigit == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
