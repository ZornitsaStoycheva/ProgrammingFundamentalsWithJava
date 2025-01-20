package ListsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> names = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] command = input.split(" ");

            if (command[2].equals("not")) {
                if(names.contains(command[0])) {

                    names.remove(command[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", command[0]);
                }
            } else {
                if(!names.contains(command[0])) {
                    names.add(command[0]);
                } else {
                    System.out.printf("%s is already in the list!%n", command[0]);
                }
            }
        }

        names.forEach(System.out::println);
    }
}
