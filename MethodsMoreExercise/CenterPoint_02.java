package MethodsMoreExercise;

import java.util.Scanner;

public class CenterPoint_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        double result1 = Math.sqrt(Math.abs(x1 * x1) + Math.abs(y1 * y1));
        double result2 = Math.sqrt(Math.abs(x2 * x2) + Math.abs(y2 * y2));

        if (result1 < result2) {
            System.out.printf("(%d, %d)", x1, y1);
        } else if(result1 > result2) {
            System.out.printf("(%d, %d)", x2, y2);
        } else {
            System.out.printf("(%d, %d)", x1, y1);
        }
    }
}
