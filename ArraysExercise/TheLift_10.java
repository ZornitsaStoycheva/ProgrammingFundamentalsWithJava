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

        boolean isFound = true;

        for (int i = 0; i < lift.length; i++) {

            int space = 4 - lift[i];

            if (space > 0) {
                if (space > people) {
                    lift[i] += people;
                    people = 0;
                    isFound = false;
                } else {
                    lift[i] = 4;
                    people -= space;
                }
            }
        }

        if (!isFound) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }

        for (int element : lift) {
            System.out.print(element + " ");
        }
    }
}
