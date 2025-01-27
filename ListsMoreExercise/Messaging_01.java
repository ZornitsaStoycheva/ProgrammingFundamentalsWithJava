package ListsMoreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> message = Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        String decodeMessage = "";

        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);

            while (current > 0) {

                int digit = current % 10;

                sum += digit;

                current /= 10;
            }

            int index = sum;

            if (sum > message.size()) {
                index = sum - message.size();
            }

            decodeMessage += message.get(index);
            message.remove(index);

            sum = 0;
        }

        System.out.println(decodeMessage);
    }
}
