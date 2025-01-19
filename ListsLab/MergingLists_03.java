package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> num1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> num2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> list = new ArrayList<>();

        int minSize = Math.min(num1.size(), num2.size());

        for (int i = 0; i < minSize; i++) {
            int firstElement = num1.get(i);
            int secondElement = num2.get(i);

            list.add(firstElement);
            list.add(secondElement);
        }

        if (num1.size() > num2.size()) {
            list.addAll(num1.subList(minSize, num1.size()));
        }

        if (num1.size() < num2.size()) {
            list.addAll(num2.subList(minSize, num2.size()));
        }

        for (int el : list) {
            System.out.print(el + " ");
        }
    }
}
