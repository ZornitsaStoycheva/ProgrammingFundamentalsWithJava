package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {

            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            String item = commandLine[1];

            if (command.equals("Urgent")) {

                if (!shoppingList.contains(item)) {
                    shoppingList.add(0, item);
                }

            } else if (command.equals("Unnecessary")) {

                if (shoppingList.contains(item)) {
                    int index = shoppingList.indexOf(item);
                    shoppingList.remove(index);
                }

            } else if (command.equals("Correct")) {

                String newItem = commandLine[2];

                if (shoppingList.contains(item)) {
                    int index = shoppingList.indexOf(item);
                    shoppingList.remove(index);
                    shoppingList.add(index, newItem);
                }

            } else if (command.equals("Rearrange")) {

                if (shoppingList.contains(item)) {
                    int index = shoppingList.indexOf(item);
                    shoppingList.remove(index);
                    shoppingList.add(shoppingList.size(), item);
                }
            }

            input = scanner.nextLine();
        }

        String output = shoppingList.stream().map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println(output);
    }
}
