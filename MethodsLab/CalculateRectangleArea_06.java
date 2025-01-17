package MethodsLab;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        System.out.println(calculatorRectangle(wight, length));
    }
    public static int calculatorRectangle(int wight, int length) {
        int area = wight * length;
        return area;
    }
}
