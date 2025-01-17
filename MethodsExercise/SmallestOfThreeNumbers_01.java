package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());

        smallestNumber(x, y, z);
    }
    public static void smallestNumber(int x, int y, int z) {
        if (x <= y && x < z || x < y && x <= z) {
            System.out.println(x);
        } else if (y <= x && y < z || y < x && y <= z) {
            System.out.println(y);
        } else  {
            System.out.println(z);
        }
    }
}
