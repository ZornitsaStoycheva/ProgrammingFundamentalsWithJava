package MethodsExercise;

import java.util.Scanner;

public class NxNMatrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <= matrix[row].length - 1; col++) {
                matrix[row][col] = n;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col <= matrix[row].length - 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
