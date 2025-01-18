package MethodsExercise;

import java.util.Arrays;
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

                if (index >= 1 && index + 1 < arr.length || index <= arr.length) {

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
                    int max = Integer.MIN_VALUE;
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0 && max < arr[i]) {
                            if(max == arr[i]) {
                                System.out.println(i);
                            }
                            max = arr[i];
                            index = i;
                        }
                    }
                    if (index == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(index);
                    }
                } else if (command.equals("odd")) {
                    int max = Integer.MIN_VALUE;
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 1 && max < arr[i]) {
                            if(max == arr[i]) {
                                System.out.println(i);
                            }
                            max = arr[i];
                            index = i;
                        }
                    }
                    if (index == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(index);
                    }
                }

            } else if (commandLine[0].equals("min")) {
                String command = commandLine[1];

                if (command.equals("even")) {
                    int min = Integer.MAX_VALUE;
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 0 && min > arr[i]) {
                            if(min == arr[i]) {
                                System.out.println(i);
                            }
                            min = arr[i];
                            index = i;
                        }
                    }
                    if (index == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(index);
                    }
                } else if (command.equals("odd")) {
                    int min = Integer.MAX_VALUE;
                    int index = -1;
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] % 2 == 1 && min > arr[i]) {
                            if(min == arr[i]) {
                                System.out.println(i);
                            }
                            min = arr[i];
                            index = i;
                        }
                    }
                    if (index == -1) {
                        System.out.println("No matches");
                    } else {
                        System.out.println(index);
                    }
                }

            } else if (commandLine[0].equals("first")) {
                int count = Integer.parseInt(commandLine[1]);
                String command = commandLine[2];

                if (command.equals("even")) {

                    int[] evenArr = new int[count];

                    if (count >= 1 && count <= arr.length) {
                       for (int i = 0; i < arr.length; i++) {
                           if (arr[i] % 2 == 0) {
                               if (i <= count) {
                                   evenArr[i] = arr[i];
                               }
                           }
                       }

                       System.out.println(Arrays.toString(evenArr));
                   } else {
                       System.out.println("Invalid count");
                   }
                } else if (command.equals("odd")) {

                        int[] oddArr = new int[count];
                        if (count >= 1 && count <= arr.length) {
                            for (int i = 0; i < arr.length; i++) {
                                if (arr[i] % 2 == 1) {
                                    if (i <= count) {
                                        oddArr[i] = arr[i];
                                    }
                                }
                            }
                            System.out.println(Arrays.toString(oddArr));
                        } else {
                            System.out.println("Invalid count");
                        }
                }

            } else if (commandLine[0].equals("last")) {
                int count = Integer.parseInt(commandLine[1]);
                String command = commandLine[2];

                if (command.equals("even")) {

                    int[] evenArr = new int[count];
                    if (count >= 1 && count <= arr.length ) {
                        for (int i = arr.length - 1; i >= 0; i--) {
                            if (arr[i] % 2 == 0) {
                                if (i <= count) {
                                    evenArr[i] = arr[i];
                                }
                            }
                        }

                        System.out.println(Arrays.toString(evenArr));
                    } else {
                        System.out.println("Invalid count");
                    }

                } else if (command.equals("odd")) {

                    int[] oddArr = new int[count];
                    if (count >= 1 && count <= arr.length ) {
                        for (int i = arr.length - 1; i >= 0; i--) {
                            if (arr[i] % 2 == 1) {
                                if (i <= count) {
                                    oddArr[i] = arr[i];
                                }
                            }
                        }

                        System.out.println(Arrays.toString(oddArr));
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
