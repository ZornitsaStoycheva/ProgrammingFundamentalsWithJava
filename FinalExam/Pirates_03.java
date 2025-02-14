package FinalExam;

import java.util.*;

public class Pirates_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Integer>> cities = new LinkedHashMap<>();

        while (!input.equals("Sail")) {

            String[] tokens = input.split("\\|\\|");

            String city = tokens[0];
            int population = Integer.parseInt(tokens[1]);
            int gold = Integer.parseInt(tokens[2]);

            if (!cities.containsKey(city)) {
                cities.put(city, new ArrayList<>());
                cities.get(city).add(0, population);
                cities.get(city).add(1, gold);
            } else {
                cities.get(city).set(0, cities.get(city).get(0) + population);
                cities.get(city).set(1, cities.get(city).get(1) + gold);
            }

            input = scanner.nextLine();
        }

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {

            String[] tokens = inputLine.split("=>");

            String command = tokens[0];
            String town = tokens[1];

            if (command.equals("Plunder")) {

                int people = Integer.parseInt(tokens[2]);
                int gold = Integer.parseInt(tokens[3]);

                if (cities.containsKey(town)) {
                    cities.get(town).set(0, cities.get(town).get(0) - people);
                    cities.get(town).set(1, cities.get(town).get(1) - gold);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n",
                            town, gold, people);
                }

                int currentPeople = cities.get(town).get(0);
                int currentGold = cities.get(town).get(1);

                if (currentPeople <= 0 || currentGold <= 0) {
                    cities.remove(town);
                    System.out.printf("%s has been wiped off the map!%n", town);
                }

            } else if (command.equals("Prosper")) {

                int gold = Integer.parseInt(tokens[2]);

                if (cities.containsKey(town)) {
                    if (gold > 0) {
                        cities.get(town).set(1, cities.get(town).get(1) + gold);
                        int currentGold = cities.get(town).get(1);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                gold, town, currentGold);
                    } else {
                        System.out.println("Gold added cannot be a negative number!");
                    }
                }
            }

            inputLine = scanner.nextLine();
        }

        if (cities.size() > 0) {

            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size());

            for (Map.Entry<String, List<Integer>> entry : cities.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",
                        entry.getKey(),
                        entry.getValue().get(0),
                        entry.getValue().get(1));
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
