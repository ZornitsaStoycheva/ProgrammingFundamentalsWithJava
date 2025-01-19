package MethodsMoreExercise;

import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        arr[0] = 1;

        if (n >= 3) {
            arr[1] = 1;
            arr[2] = 2;
            for (int i = 3; i < n; i++) {

                arr[i] = arr[i - 2] + arr[i - 1] + arr[i - 3];
            }
        } else  {
            for (int i = 1; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i];
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
