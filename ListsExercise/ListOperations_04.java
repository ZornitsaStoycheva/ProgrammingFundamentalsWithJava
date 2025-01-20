package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            String[] commandLine = input.split(" ");

            if (commandLine[0].equals("Add")) {
                int number = Integer.parseInt(commandLine[1]);

                numbers.add(numbers.size() - 1, number);

            } else if (commandLine[0].equals("Remove")) {
                int index = Integer.parseInt(commandLine[1]);

                if(index >= 0 && index <= numbers.size() - 1) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (commandLine[0].equals("Insert")) {
                int number = Integer.parseInt(commandLine[1]);
                int index = Integer.parseInt(commandLine[2]);

                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }


            } else if (commandLine[0].equals("Shift")) {
                int count = Integer.parseInt(commandLine[2]);

                if(commandLine[1].equals("left")) {

                    while (count > 0) {

                        int currentNum = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(currentNum);

                        count--;
                    }

                } else if (commandLine[1].equals("right")) {

                    while (count != 0) {

                        int currentNum = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0,currentNum);

                        count--;
                    }
                }
            }

            input = scanner.nextLine();
        }

        numbers.forEach(x -> System.out.print(x + " "));
    }
}
