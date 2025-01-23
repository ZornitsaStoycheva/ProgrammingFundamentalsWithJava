package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isBomb = numbers.contains(arr[0]);


            while (numbers.contains(arr[0])) {
                int index = numbers.indexOf(arr[0]);
                int currentIndexRight = arr[1];
                int currentIndexLeft = arr[1];

                while (index <= numbers.size() - 1 && currentIndexRight > 0) {
                    numbers.remove(index + 1);
                    currentIndexRight--;
                    index ++;
                }

                index = numbers.indexOf(arr[0]);
                while (index - 1 >= 0 && currentIndexLeft > 0) {
                    numbers.remove(index - 1);
                    index--;

                    currentIndexLeft--;
                }
                index = numbers.indexOf(arr[0]);
                numbers.remove(index);
            }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
