package MapsLambdaAndStreamAPIMoreExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class MOBAChallenger_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> moba = new HashMap<>();

        while (!input.equals("Season end")) {

            if(input.contains("->")) {

                String[] inputLine = input.split("\\s+->\\s+");

                String player = inputLine[0];
                String position = inputLine[1];
                int points = Integer.parseInt(inputLine[2]);

                if(!moba.containsKey(player)) {
                    moba.put(player, new HashMap<>());
                    moba.get(player).put(position, points);
                } else {
                    Map<String, Integer> map = moba.get(player);
                    if(map.containsKey(position)) {
                        int current = map.get(player);

                        if (current < points) {
                            map.put(position, points);
                        }
                    }

                    moba.get(player).put(position, points);
                }

            } else {

                String[] battle = input.split("\\s+vs\\s+");

                String player1 = battle[0];
                String player2 = battle[1];

                if(moba.containsKey(player1) && moba.containsKey(player2)) {
                    Map<String, Integer> mapPlayer1 = moba.get(player1);

                    Map<String, Integer> mapPlayer2 = moba.get(player2);

                    for (Map.Entry<String, Integer> entry : mapPlayer1.entrySet()) {
                        if (mapPlayer2.containsKey(entry.getKey())) {
                            int currentPlayer2 = mapPlayer2.get(entry.getKey());
                            int currentPlayer1 = entry.getValue();

                            if(currentPlayer1 > currentPlayer2) {
                                moba.remove(player2);
                            } else {
                                moba.remove(player1);
                            }
                        }
                    }

                }
            }

            input = scanner.nextLine();
        }
        System.out.println(moba);

        for (Map.Entry<String, Map<String, Integer>> entry : moba.entrySet()) {

            int sum = entry.getValue().values().stream().mapToInt(Integer::intValue).sum();

            System.out.printf("%s: %d skill%n", entry.getKey(), sum);

            Stream<Map.Entry<String, Integer>> sorted = entry.getValue().entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed());

            Stream<Map.Entry<String, Integer>> sorted1 =
                    sorted.sorted((a, b) -> b.getKey().compareTo(a.getKey()));

            sorted1.forEach(x -> System.out.printf("- %s <::> %d%n", x.getKey(), x.getValue()));
        }
    }
}
