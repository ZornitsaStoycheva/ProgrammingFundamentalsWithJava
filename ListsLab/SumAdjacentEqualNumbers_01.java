package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        DecimalFormat df = new DecimalFormat("0.#");

        for (int i = 0; i < numbers.size() - 1; i++) {
            double firstEl = numbers.get(i);
            double secondEl = numbers.get(i + 1);

            if (firstEl == secondEl) {
                numbers.set(i, numbers.get(i) + numbers.get(i + 1));
                numbers.remove(i + 1);

                i = -1;
            }
        }

        for (double element : numbers) {
            System.out.print(df.format(element) + " ");
        }
    }
}
