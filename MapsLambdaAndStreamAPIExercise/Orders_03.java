package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] arr = new String[2];

        Map<String, List<Double>> items = new LinkedHashMap<>();

        while (!input.equals("buy")) {

            String[] inputLine = input.split(" ");

            String product = inputLine[0];
            Double price = Double.parseDouble(inputLine[1]);
            Double quantity = Double.parseDouble(inputLine[2]);

            if(!items.containsKey(product)) {
                items.put(product, Arrays.asList(price, quantity));
            } else {

                items.get(product).set(0, price);
                items.get(product).set(1, items.get(product).get(1) + quantity);

            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Double>> entry : items.entrySet()) {
            double sum = entry.getValue().get(0) * entry.getValue().get(1);
            System.out.printf("%s -> %.2f%n", entry.getKey(), sum);
        }


    }
}
