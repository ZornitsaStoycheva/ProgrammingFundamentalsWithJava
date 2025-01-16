package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputLine = input.split(" ");
            String command = inputLine[0];

            if (command.equals("swap")) {
                int index1 = Integer.parseInt(inputLine[1]);
                int index2 = Integer.parseInt(inputLine[2]);

                int index = arr[index1];
                int i = arr[index2];
                arr[index1] = i;
                arr[index2] = index;

            } else if (command.equals("multiply")) {
                int index1 = Integer.parseInt(inputLine[1]);
                int index2 = Integer.parseInt(inputLine[2]);

                int index = arr[index1];
                int i = arr[index2];
                int sum = index * i;
                arr[index1] = sum;

            } else if (command.equals("decrease")) {
                for (int i = 0; i <= arr.length - 1; i++) {
                    arr[i] = arr[i] - 1;
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
