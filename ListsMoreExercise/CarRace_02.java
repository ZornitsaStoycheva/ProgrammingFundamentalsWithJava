package ListsMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CarRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        double timeFirstPlayer = 0.0;
        String left = "";
        double timeSecondPlayer = 0.0;
        String right = "";

        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == 0) {
                timeFirstPlayer -= timeFirstPlayer * 0.20;
            }
            timeFirstPlayer += arr[i];
            left = "left";
        }

        for (int i = arr.length - 1; i > arr.length / 2; i--) {
            if (arr[i] == 0) {
                timeSecondPlayer -= timeSecondPlayer * 0.20;
            }

            timeSecondPlayer += arr[i];
            right = "right";
        }

        if (timeFirstPlayer < timeSecondPlayer) {
            System.out.printf("The winner is %s with total time: %.1f%n", left,timeFirstPlayer);
        } else {
            System.out.printf("The winner is %s with total time: %.1f%n", right, timeSecondPlayer);
        }
    }
}
