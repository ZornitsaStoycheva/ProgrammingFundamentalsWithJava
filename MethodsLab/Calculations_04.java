package MethodsLab;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        calculator(n1, n2, command);
    }
    public static int calculator(int num1, int num2, String input) {
        int sum = 0;
        if (input.equals("add")) {
            sum = num1 + num2;
        } else if (input.equals("multiply")) {
            sum = num1 * num2;
        } else if (input.equals("subtract")) {
            sum = num1 - num2;
        } else if (input.equals("divide")) {
            sum = num1 / num2;
        }

        System.out.println(sum);

        return  sum;
    }
}
