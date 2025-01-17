package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(getSum(num));

    }
    public static int getOddDigit(int digit) {
        digit = Math.abs(digit);
        int sumOddDigit = 0;
        while (digit > 0) {
            int n = digit % 10;

            if(n % 2 == 1) {
                sumOddDigit += n;
            }
            digit = digit / 10;
        }
        return sumOddDigit;
    }

    public static int getEvenDigit(int digit) {
        digit = Math.abs(digit);
        int sumEvenDigit = 0;
        while (digit > 0) {
            int n = digit % 10;

            if (n % 2 == 0) {
                sumEvenDigit += n;
            }
            digit = digit / 10;
        }
        return sumEvenDigit;
    }
    public static int getSum(int n) {
        int sum = 1;
        int oddDigit = getOddDigit(n);
        int evenDigit = getEvenDigit(n);

        return sum = oddDigit * evenDigit;
    }
}
