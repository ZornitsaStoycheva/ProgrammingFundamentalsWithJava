package MapsLambdaAndStreamAPIMoreExercise;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Judge_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> judge = new LinkedHashMap<>();

        while (!input.equals("no more time")) {

            String[] inputLine = input.split(" -> ");
            String user = inputLine[0];
            String content = inputLine[1];
            int points = Integer.parseInt(inputLine[2]);

            if(!judge.containsKey(content)) {
                judge.put(content, new LinkedHashMap<>());
                judge.get(content).put(user, points);
            } else {
                judge.get(content).put(user, points);
                Map<String, Integer> map = judge.get(content);
                int current = map.get(user);

                if (current < points) {
                    map.put(user, points);
                }

                map.put(user, points);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Integer>> entry : judge.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());

            Stream<Map.Entry<String, Integer>> sorted = entry.getValue().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed());


            Stream<Map.Entry<String, Integer>> sorted1 =
                    sorted.sorted((a, b) -> b.getValue().compareTo(a.getValue()));

            sorted1.forEach((x) -> {
                int count = 0;
                count++;

                System.out.printf("%d.%s -> %d%n", count + 1, x.getKey(), x.getValue());
        });
        }
    }
}
