package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> arr = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (arr.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                index = 0;
                arr.add(0, arr.get(arr.size() - 1));
            }

            if (index > arr.size() -1) {
                index = arr.size() - 1;
                arr.add(arr.size(), arr.get(0));
            }

            int currentIndex = arr.get(index);
            for (int i = 0; i < arr.size(); i++) {

                if (currentIndex >= arr.get(i)) {
                    arr.set(i, currentIndex + arr.get(i));
                } else {
                    arr.set(i, arr.get(i) - currentIndex);
                }
            }

            arr.remove(index);
            sum += currentIndex;
        }

        System.out.println(sum);
    }
}
