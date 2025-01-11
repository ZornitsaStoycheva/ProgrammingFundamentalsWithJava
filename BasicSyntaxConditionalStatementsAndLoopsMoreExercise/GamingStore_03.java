package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double balance = currentBalance;
        double gamePrice = 0.0;
        String nameGame = "";

        while (!command.equals("Game Time")) {

            if (command.equals("OutFall 4")) {
                gamePrice = 39.99;
                nameGame = "OutFall 4";
            } else if (command.equals("CS: OG")) {
                gamePrice = 15.99;
                nameGame = "CS: OG";
            } else if (command.equals("Zplinter Zell")) {
                gamePrice = 19.99;
                nameGame = "Zplinter Zell";
            } else if (command.equals("Honored 2")) {
                gamePrice = 59.99;
                nameGame = "Honored 2";
            } else if (command.equals("RoverWatch")) {
                gamePrice = 29.99;
                nameGame = "RoverWatch";
            } else if (command.equals("RoverWatch Origins Edition")) {
                gamePrice = 39.99;
                nameGame = "RoverWatch Origins Edition";
            }

            balance = balance - gamePrice;

            if (nameGame.equals("")) {
                balance += gamePrice;
                nameGame = "";
                System.out.println("Not Found");
            } else  if (balance < 0) {
                balance += gamePrice;
                nameGame = "";
                System.out.println("Too Expensive");
            } else {
                System.out.printf("Bought %s%n", nameGame);
            }

            if (balance == 0) {
                System.out.println("Out of money!");
                break;
            }

            command = scanner.nextLine();
        }

        if (command.equals("Game Time")) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", currentBalance - balance, balance);
        }
    }
}
