package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int sum = 0;
        boolean isEqual = true;

        if (maxLength < firstArr.length) {
            maxLength = firstArr.length;
        } else if (maxLength < secondArr.length) {
            maxLength = secondArr.length;
        }

        for (int i = 0; i < maxLength; i++) {
            if (firstArr[i] != secondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                isEqual = false;
                break;
            } else {
                sum += firstArr[i];
            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
