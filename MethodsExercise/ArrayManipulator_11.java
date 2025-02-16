package MethodsExercise;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class ArrayManipulator_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");

            if(commandLine[0].equals("exchange")) {
                int index = Integer.parseInt(commandLine[1]);

                if (index >= 0 && index + 1 < arr.length || index <= arr.length) {

                    for (int i = 1; i <= index + 1; i++) {
                        int firstNum = arr[0];

                        for (int j = 0; j < arr.length - 1; j++) {
                            arr[j] = arr[j + 1];
                        }

                        arr[arr.length - 1] = firstNum;
                    }
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandLine[0].equals("max")) {
                String command = commandLine[1];

                if (command.equals("even")) {

                    int i1 = Arrays.stream(arr).filter(x -> x % 2 == 0).max().orElse(1);

                    if (i1 == 1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(arr[i1]);
                    }
                } else if (command.equals("odd")) {

                    int i = Arrays.stream(arr).filter(x -> x % 2 == 1).max().orElse(0);

                    if (i == 0) {
                        System.out.println("No matches");
                    } else {
                        System.out.println();
                    }
                }

            } else if (commandLine[0].equals("min")) {
                String command = commandLine[1];

                if (command.equals("even")) {

                    int i1 = Arrays.stream(arr).filter(x -> x % 2 == 0).min().orElse(1);

                    if (i1 == 1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(arr[i1]);
                    }
                } else if (command.equals("odd")) {

                    int i = Arrays.stream(arr).filter(x -> x % 2 == 1).min().orElse(0);

                    if (i == 0) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(arr[i]);
                    }
                }

            } else if (commandLine[0].equals("first")) {
                int count = Integer.parseInt(commandLine[1]);
                String command = commandLine[2];

                if (command.equals("even")) {

                    if (count >= 1 && count <= arr.length) {
                        int[] ints = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();

                        for (int i = 0; i < count; i++) {
                            System.out.print(ints[i] + " ");
                        }

                   } else {
                       System.out.println("Invalid count");
                   }
                } else if (command.equals("odd")) {

                    if (count >= 1 && count <= arr.length) {
                        int[] ints = Arrays.stream(arr).filter(x -> x % 2 == 1).toArray();

                        for (int i = 0; i < count; i++) {
                            System.out.print(ints[i] + " ");
                        }

                    } else {
                        System.out.println("Invalid count");
                    }

                }

            } else if (commandLine[0].equals("last")) {
                int count = Integer.parseInt(commandLine[1]);
                String command = commandLine[2];

                if (command.equals("even")) {

                    if (count >= 1 && count <= arr.length) {
                        int[] ints = Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();

                        for (int i = 0; i < count; i++) {
                            System.out.print(ints[i] + " ");
                        }

                    } else {
                        System.out.println("Invalid count");
                    }

                } else if (command.equals("odd")) {

                    int counter = 0;
                    int[] oddArr = new int[count];
                    if (count >= 1 && count <= arr.length) {
                        for (int i = arr.length - 1; i >= 0; i--) {
                            if (arr[i] % 2 == 1) {
                                if (counter < oddArr.length) {
                                    oddArr[counter] = arr[i];
                                    counter++;
                                }
                            }
                        }
                        int[] sorted = Arrays.stream(oddArr).sorted().toArray();
                        int[] result = Arrays.stream(oddArr).filter(x -> x != 0).toArray();
                        System.out.println(Arrays.toString(result));
                    } else {
                        System.out.println("Invalid count");
                    }
                }

            }


            input = scanner.nextLine();
        }

        System.out.println(Arrays.toString(arr));
    }
}
