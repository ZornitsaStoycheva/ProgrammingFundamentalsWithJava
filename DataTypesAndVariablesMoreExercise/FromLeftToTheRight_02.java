package DataTypesAndVariablesMoreExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String[] digits = input.split(" ");
            long firstNum = Integer.parseInt(digits[0]);
            long secondNum = Integer.parseInt(digits[1]);

            int sum = 0;
            if (firstNum > secondNum) {
                sum = sumOnDigit(firstNum);
            } else {
                sum = sumOnDigit(secondNum);
            }

            System.out.println(sum);
        }
    }

    public static int sumOnDigit(long num) {
        int sum = 0;

        while (num != 0) {

            long digit = num % 10;
            sum += digit;
            num = num /10;
        }
       return  sum;
    }
}
