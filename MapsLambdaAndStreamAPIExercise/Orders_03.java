package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] games = scanner.nextLine().split("\\s+");

        Map<String, Integer> legendary = new TreeMap<>();

        int digit = 0;
        String modes = "";

        for (int i = 0; i < games.length; i++) {
            if (i % 2 == 0) {
                digit = Integer.parseInt(games[i]);
            } else {
                modes = games[i].toLowerCase();
                if (!legendary.containsKey(modes)) {
                    legendary.put(modes, digit);
                } else {
                    legendary.put(modes, legendary.get(modes) + digit);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        String winner = "";

        for (Map.Entry<String, Integer> entry : legendary.entrySet()) {
            if (entry.getKey().equals("shards") && entry.getValue() >= 250) {
                legendary.put(entry.getKey(), legendary.get(entry.getKey()) - 250);
                winner = "Shadowmourne";
            } else if (entry.getKey().equals("fragments") && entry.getValue() >= 250) {
                legendary.put(entry.getKey(), legendary.get(entry.getKey()) - 250);
                winner = "Valanyr";
            } else if (entry.getKey().equals("motes") && entry.getValue() >= 250) {
                winner = "Dragonwrath";
                legendary.put(entry.getKey(), legendary.get(entry.getKey()) - 250);
            }
        }

        System.out.printf("%s obtained!%n", winner);

        for (Map.Entry<String, Integer> entry : legendary.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }
}
