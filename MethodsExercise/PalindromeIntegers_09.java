package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int num = Integer.parseInt(input);
            boolean isPalindrome = false;
            int count = 0;

            while (num > 0) {

                for (int i = 0; i < input.length(); i++) {
                    int digit = num % 10;
                    char symbol = input.charAt(i);
                    int n = Integer.parseInt(String.valueOf(symbol));
                    if(digit != n) {
                        isPalindrome = true;

                    }
                    num /= 10;
                }

            }

            if (!isPalindrome) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }
}
