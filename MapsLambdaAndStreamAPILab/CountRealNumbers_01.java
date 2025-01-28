package MapsLambdaAndStreamAPILab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        TreeMap<Double, Integer> counts = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            double num = list.get(i);
            if (!counts.containsKey(list.get(i))) {
                counts.put(list.get(i), 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
