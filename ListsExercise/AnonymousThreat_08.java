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

            if (startIndex < 0) {
                startIndex = 0;
            }


            if(lineCommand.equals("merge")) {

                if (endIndex > input.size()) {
                    endIndex = input.size();
                }

                for (int i = startIndex + 1; i < endIndex; i++) {
                    String current = input.get(startIndex);

                    input.set(startIndex, input.get(startIndex).concat(input.get(i)));
                    input.remove(input.get(i));
                    i --;
                    endIndex --;
                }

            } else if (lineCommand.equals("divide")) {

                if (input.get(startIndex).length() < endIndex) {
                    endIndex = input.get(startIndex).length();
                }

                String current = input.get(startIndex);

                if (current.length() % 2 == 0) {

                    for (int i = 0; i < current.length(); i++) {
                        
                    }

                }

            }

            command = scanner.nextLine();
        }

        for (String element : input) {
            System.out.print(element + " ");
        }
    }
}
