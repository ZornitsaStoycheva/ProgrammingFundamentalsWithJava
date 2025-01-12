package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 4 ; i++) {
            int digit = Integer.parseInt(scanner.nextLine());

            if (i == 1 || i == 2) {
                sum += digit;
            }

            if (i == 3) {
                sum /= digit;
            }

            if ((i == 4)) {
                sum *= digit;
            }
        }
        System.out.println(sum);
    }
}
