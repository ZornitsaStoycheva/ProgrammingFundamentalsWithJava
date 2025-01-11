package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //double money = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double allMoney = 0.0;
        while (!command.equals("Start")) {

            double money = Double.parseDouble(command);
            if (money != 1 && money != 2 && money != 0.1 && money != 0.2 && money != 0.5) {
                System.out.printf("Cannot accept %.2f%n", money);
            } else {
                allMoney += money;
            }

            command = scanner.nextLine();
        }

        String purchased = scanner.nextLine();
        double price = 0.0;
        String product = "";

        while (!purchased.equals("End")) {

            if (purchased.equals("Nuts")) {
                price = 2.0;
                product = "Nuts";
            } else if (purchased.equals("Water")) {
                price = 0.7;
                product = "Water";
            } else if (purchased.equals("Crisps")) {
                price = 1.5;
                product = "Crisps";
            } else if (purchased.equals("Soda")) {
                price = 0.8;
                product = "Soda";
            } else if (purchased.equals("Coke")) {
                price = 1.0;
                product = "Coke";
            }


            if (product.equals("")) {
                System.out.println("Invalid product");
            } else if (allMoney < price) {
                System.out.println("Sorry, not enough money");
            } else {
                allMoney = allMoney - price;
                System.out.printf("Purchased %s%n", product);
            }


            purchased = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", allMoney);
    }
}
