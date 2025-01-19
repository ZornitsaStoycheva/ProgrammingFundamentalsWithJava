package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandLine = input.split(" ");

            if (commandLine[0].equals("Contains")) {
                int num = Integer.parseInt(commandLine[1]);

                boolean isContain = numbers.contains(num);

                if (isContain) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            } else if (commandLine[0].equals("Print")) {
                String command = commandLine[1];

                if (command.equals("even")) {
                    List<Integer> even = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
                    even.forEach(x -> System.out.print(x + " "));
                    System.out.println();
                } else if (command.equals("odd")) {
                    List<Integer> odd = numbers.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
                    odd.forEach(x -> System.out.print(x + " "));
                    System.out.println();
                }

            } else if (commandLine[0].equals("Get")) {
                String text = commandLine[1];

                int sum = numbers.stream().mapToInt(Integer::intValue).sum();

                System.out.println(sum);

            } else if (commandLine[0].equals("Filter")) {
                String condition = commandLine[1];
                int digit = Integer.parseInt(commandLine[2]);

                List<Integer> list = new ArrayList<>();
                if (condition.equals(">")) {
                   list = numbers.stream().filter(x -> x > digit).collect(Collectors.toList());
                } else if (condition.equals(">=")) {
                    list = numbers.stream().filter(x -> x >= digit).collect(Collectors.toList());
                } else if (condition.equals("<")) {
                    list = numbers.stream().filter(x -> x < digit).collect(Collectors.toList());
                } else if (condition.equals("<=")) {
                    list = numbers.stream().filter(x -> x <= digit).collect(Collectors.toList());
                }

                list.forEach(x -> System.out.print(x + " "));
                System.out.println();
            }
            input = scanner.nextLine();
        }
    }
}
