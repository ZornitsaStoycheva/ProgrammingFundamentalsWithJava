package MethodsExercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        double factorial1 = 1;
        double factorial2 = 1;

        DecimalFormat output = new DecimalFormat("0.00");

        for (int i = 1; i <= x ; i++) {
            factorial1 *= i;
        }

        for (int i = 1; i <= y ; i++) {
            factorial2 *= i;
        }

        double factorial = factorial1 / factorial2;

        System.out.println(output.format(factorial));
    }
}
