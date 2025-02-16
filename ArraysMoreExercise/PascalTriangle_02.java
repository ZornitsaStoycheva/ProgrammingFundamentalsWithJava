package ArraysMoreExercise;

import java.util.Scanner;

public class PascalTriangle_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] pascalTriangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            pascalTriangle[i] = new int[i + 1];
            pascalTriangle[i][0] = 1;
            if ( i > 0) {
                pascalTriangle[i][1] = 1;
            }
            //pascalTriangle[i][1] = 1;

            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j] + pascalTriangle[i - 1][j - 1];
            }
        }

        for (int row = 0; row < pascalTriangle.length; row++) {
            for (int col = 0; col < pascalTriangle[row].length; col++) {
                System.out.print(pascalTriangle[row][col] + " ");
            }
            System.out.println();
        }
    }
}
