package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num2 ; i++) {
            char symbol = (char) i;
            System.out.printf("%c ", symbol);
        }
    }
}
