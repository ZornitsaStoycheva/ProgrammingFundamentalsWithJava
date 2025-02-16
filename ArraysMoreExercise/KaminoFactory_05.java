package ArraysMoreExercise;

import java.util.Scanner;

public class KaminoFactory_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        int counter = 0;
        boolean isEqual = true;

        String input = scanner.nextLine();

        while (!input.equals("Clone them!")) {

            String[] tokens = input.split("!+");

            for (int i = 0; i < tokens.length; i++) {
                int num = Integer.parseInt(tokens[i]);
                int num1 = Integer.parseInt(tokens[i + 1]);

                if (num == num1) {
                    counter++;
                } else {
                    isEqual = false;
                }

                if (!isEqual) {
                    counter = 0;
                }
            }

            input = scanner.nextLine();
        }
    }
}
