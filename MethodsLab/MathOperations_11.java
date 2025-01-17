package MethodsLab;

import java.nio.IntBuffer;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(getOperation(num1, operator, num2)));
    }
    public static double getOperation(int n, String operator, int m) {
        double sum = 0.0;
        switch (operator) {
            case "+":
                sum = n + m;
                break;
            case "-":
                sum = n - m;
                break;
            case "*":
                sum = n * m;
                break;
            case "/":
                sum = (n * 1.0) / m;
                break;
        }
        return sum;
    }
}
