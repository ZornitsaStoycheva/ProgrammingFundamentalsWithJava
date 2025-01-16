package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;
        for (int i = 0; i <= arr.length - 1; i++) {
            int currentElement = arr[i];
            int leftSum = 0;
            int rightSum = 0;

            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for (int j = i + 1; j <= arr.length - 1 ; j++) {
                rightSum += arr[j];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}
