package ArraysMoreExercise;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int unique = i + 1;
            System.out.println(1);
            for (int j = 1; j < i; j++) {
                int digit = i - j + j - 1;
                System.out.print(digit + " ");
            }
        }
    }
}
