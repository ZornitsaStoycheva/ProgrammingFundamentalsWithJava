package MethodsExercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            boolean isTopInteger = false;
            int sum = 0;
            int x = i;
            int odd = i;
            int count = 0;
            while (x > 0) {

                int digit = x % 10;
                odd = x % 10;
                if (odd % 2 == 1) {
                    count ++;
                }
                sum += digit;

                x /= 10;
            }

            if (sum % 8 == 0 && count >= 1) {
                isTopInteger = true;
            }

            if(isTopInteger) {
                System.out.println(i);
            }
        }
    }
}
