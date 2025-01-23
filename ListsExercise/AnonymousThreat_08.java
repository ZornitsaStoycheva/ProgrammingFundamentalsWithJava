package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] line = command.split(" ");
            String lineCommand = line[0];
            int startIndex = Integer.parseInt(line[1]);
            int endIndex = Integer.parseInt(line[2]);

            if(lineCommand.equals("merge")) {
                String start = "";

                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (endIndex > input.size() - 1) {
                    endIndex = input.size() - 1;
                }

                for (int i = startIndex + 1; i <= endIndex; i++) {
                    String a = input.get(startIndex);
                    start = a.concat(input.get(startIndex + 1));
                    input.set(startIndex, start);
                    input.remove(startIndex + 1);
                }
            } else if (lineCommand.equals("divide")) {

            }

            command = scanner.nextLine();
        }

        for (String element : input) {
            System.out.print(element + " ");
        }
    }
}
