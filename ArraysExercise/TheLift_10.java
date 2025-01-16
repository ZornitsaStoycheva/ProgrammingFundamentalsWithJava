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
                int wagon = lift[i];
                if (people > 4) {
                    int stayPeople = people - (people - 4 + wagon);
                    people -= stayPeople;
                    lift[i] += stayPeople;
                } else {
                    isFound = true;
                    lift[i] = people - wagon;
                    people = people - lift[i];
                    //people -= people - (people - 4 + wagon);
                }

                if (people <= 0) {
                    isFound = true;
                    break;
                }
            }
        }
        if (people == 0 && !isFound) {
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
    }
}
