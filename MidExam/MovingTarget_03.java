package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            int index = Integer.parseInt(commandLine[1]);

            if (command.equals("Shoot")) {

                int power = Integer.parseInt(commandLine[2]);

                boolean isValid = isValidIndex(index, numbers);

                if(isValid) {
                    int currentIndex = numbers.get(index);

                    if(currentIndex > power) {
                        currentIndex = currentIndex - power;
                        numbers.set(index, currentIndex);
                    } else {
                        numbers.remove(index);
                    }
                }
            } else if (command.equals("Add")) {

                int value = Integer.parseInt(commandLine[2]);

                boolean isValid = isValidIndex(index, numbers);

                if(isValid) {
                    numbers.add(index, value);
                } else {
                    System.out.println("Invalid placement!");
                }

            } else if (command.equals("Strike")) {

                int radius = Integer.parseInt(commandLine[2]);

                boolean isValid = isValidIndex(index, numbers);

                if((isValid) && (index - radius >= 0 && index + radius <= numbers.size() - 1)) {
                    for (int i = index + radius; i >= index - radius; i--) {
                        numbers.remove(numbers.get(i));
                    }

                } else {
                    System.out.println("Strike missed!");
                }
            }

            input = scanner.nextLine();
        }

        String separator = "|";
        String toPrint = numbers.stream().map(o -> String.valueOf(o)).collect(Collectors.joining(separator));

        System.out.println(toPrint);
    }

    public static boolean isValidIndex(int index, List<Integer> arr) {
        return index >= 0 && index <  arr.size();
    }
}
