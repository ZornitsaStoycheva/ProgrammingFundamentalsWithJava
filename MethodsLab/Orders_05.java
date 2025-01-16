package MethodsLab;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        priceCalculator(product, quantity);
    }
    public static void priceCalculator(String product, int quantity) {

        double price = 0.0;
        switch (product) {
            case "coffee":
                price = quantity * 1.50;
                System.out.printf("%.2f", price);
                break;
            case "water":
                price = quantity * 1.00;
                System.out.printf("%.2f", price);
                break;
            case  "coke":
                price = quantity * 1.40;
                System.out.printf("%.2f", price);
                break;
            case "snacks":
                price = quantity * 2.00;
                System.out.printf("%.2f", price);
                break;
        }
    }
}
