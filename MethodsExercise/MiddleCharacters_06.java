package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int length = 0;

        if(input.length() % 2 == 0) {
            length = input.length() / 2;
            char symbol = input.charAt(length - 1);
            char nexy = input.charAt(length);
            System.out.printf("%c%c", symbol, nexy);
        } else {
            length = input.length() / 2;
            char symbol = input.charAt(length);
            System.out.println(symbol);
        }


    }
}
