package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] input = command.split(" ");
            int digit = Integer.parseInt(input[1]);

            if(input[0].equals("Add")) {
                numbers.add(numbers.size(), digit);

            } else if (input[0].equals("Remove")) {
                boolean isContains = numbers.contains(digit);
                if (isContains) {
                    int index = numbers.indexOf(digit);
                    numbers.remove(index);
                }

            } else if (input[0].equals("RemoveAt")) {
                numbers.remove(digit);

            } else if (input[0].equals("Insert")) {
                int index = Integer.parseInt(input[2]);
                numbers.add(index, digit);
            }

            command = scanner.nextLine();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
