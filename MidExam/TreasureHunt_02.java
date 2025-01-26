package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chest = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {

            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            if (command.equals("Loot")) {

                for (int i = 1; i < commandLine.length; i++) {
                    if (!chest.contains(commandLine[i])) {
                        chest.add(0, commandLine[i]);
                    }
                }

            } else if (command.equals("Drop")) {

                int index = Integer.parseInt(commandLine[1]);
                boolean isValid = isValidIndex(index, chest);

                if (isValid) {
                    String item = chest.get(index);
                    chest.remove(index);
                    chest.add(chest.size(), item);
                }

            } else if (command.equals("Steal")) {

                List<String> stealItems = new ArrayList<>();

                int count = Integer.parseInt(commandLine[1]);

                while (count > 0) {
                    if (count > chest.size()) {
                        count = chest.size();
                    }

                    String item = chest.get(chest.size() - 1);
                    chest.remove(chest.size() - 1);
                    stealItems.add(0, item);

                    count--;
                }

                String output = stealItems.stream().map(String::valueOf).collect(Collectors.joining(", "));
                System.out.println(output);
            }

            input = scanner.nextLine();
        }

        double sumLength = 0.0;

        if (chest.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            for (int i = 0; i < chest.size(); i++) {
                int lenht = chest.get(i).length();
                sumLength += lenht;
            }

            double average = sumLength / chest.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", average);
        }
    }
    public static boolean isValidIndex (int index, List<String> list) {
        return index >= 0 && index < list.size();
    }
}
