package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];
        int[] secondArr = new  int[n];

        for (int i = 0; i < n; i++) {
            int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            for (int j = 0; j < numbers.length; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
                    firstArr[i] = numbers[j];
                } else {
                    secondArr[i] = numbers[j];
                }
            }
        }

        for (int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }
    }
}
