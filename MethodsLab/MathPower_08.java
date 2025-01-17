package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(new  DecimalFormat("0.####").format(mathPower(num, n)));
    }
    public static double mathPower(double num, int n) {
        double sum = Math.pow(num, n);
        return  sum;
    }
}
