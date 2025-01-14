package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Integer.MIN_VALUE;
        boolean isBigger = true;

        for (int i = 0; i < arr.length; i++) {
            int firstNum = arr[i];
            for (int j = 0; j < arr.length - 1; j++) {

                if (firstNum > arr[j]) {
                    max = firstNum;
                }
                //System.out.print(max + " ");
            }
//            if (!isBigger) {
            System.out.print(max + " ");

        }
    }
}
