package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());

        int[] arr = {x, y, z};

        int[] sortArr = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i <= sortArr.length - 1 ; i++) {
            System.out.println(sortArr[i]);
        }
    }
}
