package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int passenger = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int num = Integer.parseInt(command[1]);

                wagons.add(wagons.size(), num);

            } else {
                int pass = Integer.parseInt(command[0]);

                int index = 0;
                while (index < wagons.size()) {

                    int wagon = wagons.get(index);

                    if (wagon + pass <= passenger) {
                        wagons.set(index, wagons.get(index) + pass);
                        break;
                    }
                    index++;
                }
            }

            input = scanner.nextLine();
        }

        wagons.forEach(x -> System.out.print(x + " "));
    }
}
