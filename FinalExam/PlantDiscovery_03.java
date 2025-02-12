package FinalExam;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double[]>> plant = new LinkedHashMap<>();
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split("<->");
            if(!plant.containsKey(inputLine[0])) {
                plant.put(inputLine[0], new ArrayList<>());
                plant.get(inputLine[0]).add(new Double[] { Double.parseDouble(inputLine[1]), 0.0, 0.0 });
            } else {
                List<Double[]> doubles = plant.get(inputLine[0]);
                Double[] doubles1 = doubles.get(0);
                doubles1[0] = Double.parseDouble(inputLine[1]);
            }
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {

            String[] commandLine = input.split(":\\s+");
            String command = commandLine[0];

            if (command.equals("Rate")) {

                String[] nextLine = commandLine[1].split("\\s+-\\s+");
                String plantNew = nextLine[0];
                double rating = Double.parseDouble(nextLine[1]);

                if (!plant.containsKey(plantNew)) {
                    plant.put(plantNew, new ArrayList<>());
                    plant.get(plantNew).add(new Double[]{});
                    Double[] doubles = plant.get(plantNew).get(0);
                    doubles[1] += rating;
                    doubles[2] += 1;
                } else {
                    Double[] doubles = plant.get(plantNew).get(0);
                    doubles[1] += rating;
                    doubles[2] += 1;
                }
            } else if (command.equals("Update")) {

                String[] nextLine = commandLine[1].split("\\s+-\\s+");
                String plantNew = nextLine[0];
                double rarity = Double.parseDouble(nextLine[1]);

                if (plant.containsKey(plantNew)) {
                    List<Double[]> doubles = plant.get(plantNew);
                    Double[] doubles1 = doubles.get(0);
                    doubles1[0] = rarity;
                }

            } else if (command.equals("Reset")) {

                String plantNew = commandLine[1];

                if (plant.containsKey(plantNew)) {
                    List<Double[]> doubles = plant.get(plantNew);
                    Double[] doubles1 = doubles.get(0);
                    doubles1[1] = 0.0;
                    doubles1[2] = 0.0;
                }
            } else {
                System.out.println("error");
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, List<Double[]>> entry : plant.entrySet()) {

            double average = 0.0;
            for (Double[] doubles : entry.getValue()) {

                if (doubles[2] != 0.0) {

                    average = doubles[1] / doubles[2];
                }
                System.out.printf("- %s; Rarity: %.0f; Rating: %.2f%n", entry.getKey(), doubles[0], average);
            }

        }

    }
}
