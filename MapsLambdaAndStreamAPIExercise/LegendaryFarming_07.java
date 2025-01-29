package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] games = scanner.nextLine().split("\\s+");

        Map<String, Integer> legendary = new LinkedHashMap<>();
        legendary.put("shards", 0);
        legendary.put("fragments" , 0);
        legendary.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();


        int digit = 0;
        String modes = "";

        for (int i = 0; i <= games.length - 1; i+=2) {
            digit = Integer.parseInt(games[i]);
            modes = games[i + 1].toLowerCase();
            if (modes.equals("motes") || modes.equals("shards") || modes.equals("fragments")) {
                if (!legendary.containsKey(modes)) {
                    legendary.put(modes, digit);
                } else {
                    legendary.put(modes, legendary.get(modes) + digit);
                }
            } else {
                if (!junk.containsKey(modes)) {
                    junk.put(modes, digit);
                } else {
                    junk.put(modes, junk.get(modes) + digit);
                }
            }

            String winner = "";
            boolean isWin = false;
            if (legendary.get("motes") >= 250) {
                legendary.put("motes", legendary.get("motes") - 250);
                winner = "Dragonwrath";
                System.out.printf("%s obtained!%n", winner);
                isWin = true;
                break;
            } else if (legendary.get("fragments") >= 250) {
                legendary.put("fragments", legendary.get("fragments") - 250);
                winner = "Valanyr";
                System.out.printf("%s obtained!%n", winner);
                isWin = true;
                break;
            } else if (legendary.get("shards") >= 250) {
                winner = "Shadowmourne";
                legendary.put("shards", legendary.get("shards") - 250);
                isWin = true;
                System.out.printf("%s obtained!%n", winner);
                break;
            }
        }


        for (Map.Entry<String, Integer> entry : legendary.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : junk.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}
