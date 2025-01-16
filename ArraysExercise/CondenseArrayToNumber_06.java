package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = 0;
        int end = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 2; i <= arr.length - 1; i++) {

            if (arr[i - 2] == arr[i] && arr[i - 1] == arr[i]) {
                start = i;
                count++;
                max = i;
                System.out.print(arr[i - 2] + " ");
            }
        }

        for (int i = start - count; i < start; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
