package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Stream;

public class Ranking_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputContents = scanner.nextLine();

        Map<String, String> contents = new LinkedHashMap<>();

        Map<String, Map<String, Integer>> users = new TreeMap<>();

        while (!inputContents.equals("end of contests")) {

            String[] inputContentsLine = inputContents.split(":");
            String content = inputContentsLine[0];
            String password = inputContentsLine[1];

            if(!contents.containsKey(content)) {
                contents.put(content, password);
            }

            inputContents = scanner.nextLine();
        }

        String input = scanner.nextLine();

        while (!input.equals("end of submissions")) {

            String[] arrInput = input.split("=>");
            String content = arrInput[0];
            String password = arrInput[1];
            String user = arrInput[2];
            int points = Integer.parseInt(arrInput[3]);

            String isPassword = contents.get(content);

            if(contents.containsKey(content) && isPassword.equals(password)) {
                if (!users.containsKey(user)) {
                    users.put(user, new LinkedHashMap<>());
                    users.get(user).put(content, points);

                } else {
                    if (users.get(user).containsKey(content)) {
                        int u = users.get(user).get(content);
                        if (u < points) {
                            users.get(user).put(content, points);
                        }
                    } else {
                        users.get(user).put(content, points);
                    }

                }
            }

            input = scanner.nextLine();
        }

        int max = Integer.MIN_VALUE;
        String output = "";
        String user = "";

        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {
            int winner = entry.getValue().values().stream()
                    .mapToInt(Integer::intValue).sum();

            if (max < winner) {
                max = winner;
                user = entry.getKey();
            }
            output = "Best candidate is %s with total %d points.%n";
        }

        System.out.printf(output, user, max);
        System.out.println("Ranking:");
        for (Map.Entry<String, Map<String, Integer>> entry : users.entrySet()) {

            System.out.printf("%s%n", entry.getKey());
            Stream<Map.Entry<String, Integer>> sorted =
                    entry.getValue().entrySet().stream().sorted((a, b) -> b.getValue().compareTo(a.getValue()));

            sorted.forEach(x -> System.out.printf("#  %s -> %d%n", x.getKey(), x.getValue()));
        }


    }
}
