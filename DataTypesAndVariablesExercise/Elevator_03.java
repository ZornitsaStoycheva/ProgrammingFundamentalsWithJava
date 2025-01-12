package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int elevator = people / capacity;
        int difference = people % capacity;

        if (difference > 0) {
            elevator += 1;
        }
        System.out.println(elevator);

    }
}
