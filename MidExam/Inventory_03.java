package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Craft!")) {
            String[] command = commandLine.split(" - ");

            String work = command[0];
            String item = command[1];

            if(work.equals("Collect")) {

                if(!inventory.contains(item)) {
                    inventory.add(item);
                }

            } else if (work.equals("Drop")) {

                if (inventory.contains(item)) {
                    int index = inventory.indexOf(item);
                    inventory.remove(index);
                }

            } else if (work.equals("Combine Items")) {

                String[] items = item.split(":");
                String oldItem = items[0];
                String newItem = items[1];

                if(inventory.contains(oldItem)) {
                    int index = inventory.indexOf(oldItem);
                    inventory.add(index + 1, newItem);
                }

            } else if (work.equals("Renew")) {

                if(inventory.contains(item)) {
                    int index = inventory.indexOf(item);
                    inventory.remove(index);
                    inventory.add(item);
                }
            }

            commandLine = scanner.nextLine();
        }

        String separator = ", ";
        String output = inventory.stream().map(String::valueOf)
                .collect(Collectors.joining(separator));

        System.out.println(output);
    }
}
