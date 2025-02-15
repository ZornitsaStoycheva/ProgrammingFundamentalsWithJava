package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            boolean isInteger = true;

            try {
                int n = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                isInteger = false;
            }

            boolean isDouble = true;

            try {
                double n = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                isDouble = false;
            }

            if (isInteger) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else if (input.equals("true") || input.equals("false") ||
            input.equals("True") || input.equals("False")) {
                System.out.printf("%s is boolean type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }

            input = scanner.nextLine();
        }
    }
}
