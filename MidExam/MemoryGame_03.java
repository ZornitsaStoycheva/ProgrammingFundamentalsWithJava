package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        int moves = 0;

        while (!inputLine.equals("end")) {
            String[] indexs = inputLine.split(" ");

            int index1 = Integer.parseInt(indexs[0]);
            int index2 = Integer.parseInt(indexs[1]);

            boolean isValidIndex1 = isValidIndex(index1, input);
            boolean isValidIndex2 = isValidIndex(index2, input);

            if(isValidIndex1 && isValidIndex2 && index1 != index2) {
                String currentEl1 = input.get(index1);
                String currentEl2 = input.get(index2);

                if(currentEl1.equals(currentEl2)) {
                    if (index1 < index2) {
                        input.remove(index2);
                        input.remove(index1);
                    } else {
                        input.remove(index1);
                        input.remove(index2);
                    }

                    moves++;
                    System.out.printf("Congrats! You have found matching elements - %s!%n", currentEl1);
                } else {
                    moves++;
                    System.out.println("Try again!");
                }
            } else {
                int size = input.size() / 2;

                if(size % 2 == 0) {
                    moves++;
                    input.add(size, "-" + moves + "a");
                    input.add(size + 1, "-" + moves + "a");
                    System.out.println("Invalid input! Adding additional elements to the board");
                }
            }

            if(input.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", moves);
                break;
            }

            inputLine = scanner.nextLine();
        }

        if(!input.isEmpty()) {
            System.out.println("Sorry you lose :(");
            input.forEach(el -> System.out.print(el + " "));
        }
    }

    public static boolean isValidIndex(int index, List<String> list) {
        return index >= 0 && index < list.size();
    }
}
