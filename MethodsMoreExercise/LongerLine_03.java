package MethodsMoreExercise;

import java.util.Scanner;

public class LongerLine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        double result1 = Math.sqrt(Math.abs(x1 * x1) + Math.abs(y1 * y1));
        double result2 = Math.sqrt(Math.abs(x2 * x2) + Math.abs(y2 * y2));
        double resultFirst = result1 + result2;

        double result3 = Math.sqrt(Math.abs(x3 * x3) + Math.abs(y3 * y3));
        double result4 = Math.sqrt(Math.abs(x4 * x4) + Math.abs(y4 * y4));
        double resultSecond = result3 + result4;

        if (resultFirst < resultSecond) {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        } else if(result1 > result2) {
            System.out.printf("(%d, %d)(%d, %d)", x3, y3, x4, y4);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        }
    }
}
