package FinalExam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BakeryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> bakery = new LinkedHashMap<>();

        int sold = 0;

        while (!input.equals("Complete")) {

            String[] commandLine = input.split(" ");

            String command = commandLine[0];
            int quantity = Integer.parseInt(commandLine[1]);
            String food = commandLine[2];

            if (command.equals("Receive")) {

                if(!bakery.containsKey(food)) {
                    bakery.put(food, quantity);
                } else {
                    bakery.put(food, bakery.get(food) + quantity);
                }

            } else if (command.equals("Sell")) {
                if(bakery.containsKey(food)) {
                    int bakeryQuantity = bakery.get(food);
                    int soldQuan = bakeryQuantity - quantity;

                    if (soldQuan > 0) {
                        bakery.put(food, bakery.get(food) - quantity);
                        sold += quantity;
                        System.out.printf("You sold %d %s.%n", quantity, food);
                    } else if (soldQuan < 0) {
                        bakery.remove(food);
                        sold += bakeryQuantity;
                        System.out.printf("There aren't enough %s. You sold the last %d of them.%n",
                                food, bakeryQuantity);
                    } else {
                        bakery.remove(food);
                        sold += quantity;
                        System.out.printf("You sold %d %s.%n", quantity, food);
                    }
                } else {
                    System.out.printf("You do not have any %s.%n", food);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : bakery.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

        System.out.printf("All sold: %d goods", sold);

    }
}
