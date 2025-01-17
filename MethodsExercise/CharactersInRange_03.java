package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        inRange(a, b);
    }
    public static void inRange(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i <= b - 1; i++) {
                char symbol = (char) i;
                System.out.print(symbol + " ");
            }
        } else {
            for (int i = b + 1; i <= a - 1; i++) {
                char symbol = (char) i;
                System.out.print(symbol + " ");
            }
        }
    }
}
