package MidExam;

import java.util.Scanner;

public class ComputerStore_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double total = 0.0;
        double dds = 0.0;

        while (!input.equals("regular") && !input.equals("special")) {
            double price = Double.parseDouble(input);

            if(price < 0) {
                System.out.println("Invalid price!");
            } else {
                total += price;
                dds += price * 0.20;
            }

            input = scanner.nextLine();
        }

        double sum = 0.0;
        double totalSum = total + dds;

        if(total == 0) {
            System.out.println("Invalid order!");
        } else if (input.equals("special")) {
            totalSum = totalSum * 0.90;
        }

        if (totalSum > 0) {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", total);
            System.out.printf("Taxes: %.2f$%n", dds);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$", totalSum);
        }
    }
}
