package ListsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] command = input.split(" ");
            int element = Integer.parseInt(command[1]);

            if (command[0].equals("Delete")) {

                numbers.removeAll(Collections.singleton(element));

            } else if (command[0].equals("Insert")) {
                int position = Integer.parseInt(command[2]);

                numbers.add(position, element);
            }

            input = scanner.nextLine();
        }

        numbers.forEach(x -> System.out.print(x + " "));
    }
}
