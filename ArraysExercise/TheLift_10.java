package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());

        int[] lift = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;

        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                if (people >= 4 - lift[i]) {
                    lift[i] = 4;
                } else {
                    lift[i] += people;
                    people = 0;
                }
            }
        }

        for (int i = 0; i < lift.length; i++) {
            if (lift[i] < 4) {
                isFound = true;
                break;
            }
        }
        if (people == 0 && isFound) {
            System.out.println("The lift has empty spots!");
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        } else if (people > 0 && !isFound) {
            System.out.println("There isn't enough space! 10 people in a queue!");
            for (int i = 0; i < lift.length; i++) {
                System.out.print(lift[i] + " ");
            }
        }

        for (int element : lift) {
            System.out.print(element + " ");
        }
    }
}
