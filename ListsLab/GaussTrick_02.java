package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int index = 0;
        int sizeList = numbers.size();

        for (int i = 0; i < sizeList / 2; i++) {

            int element = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.set(i, element);
            numbers.remove(numbers.size() - 1);
        }

        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
