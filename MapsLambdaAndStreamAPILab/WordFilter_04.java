package MapsLambdaAndStreamAPILab;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fruits = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        Arrays.stream(fruits).forEach(System.out::println);
    }
}
