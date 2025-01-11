package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String groupOfPeople = scanner.nextLine();
        String typeOfDay = scanner.nextLine();

        double price = 0.0;
        double totalPrice = 0.0;

        if (typeOfDay.equals("Friday")) {
            if (groupOfPeople.equals("Students")) {
                price = 8.45;
            } else if (groupOfPeople.equals("Business")) {
                price = 10.90;
            } else if (groupOfPeople.equals("Regular")) {
                price = 15;
            }
        } else if (typeOfDay.equals("Saturday")) {
            if (groupOfPeople.equals("Students")) {
                price = 9.80;
            } else if (groupOfPeople.equals("Business")) {
                price = 15.60;
            } else if (groupOfPeople.equals("Regular")) {
                price = 20;
            }
        } else if (typeOfDay.equals("Sunday")) {
            if (groupOfPeople.equals("Students")) {
                price = 10.46;
            } else if (groupOfPeople.equals("Business")) {
                price = 16;
            } else if (groupOfPeople.equals("Regular")) {
                price = 22.50;
            }
        }

        totalPrice = countPeople * price;

        if (groupOfPeople.equals("Students") && countPeople >= 30) {
            totalPrice = totalPrice - (totalPrice * 0.15);
        } else if (groupOfPeople.equals("Business") && countPeople >= 100) {
            totalPrice = (countPeople - 10) * price;
        } else if (groupOfPeople.equals("Regular") && countPeople >= 10 && countPeople <= 20) {
            totalPrice = totalPrice - (totalPrice * 0.05);
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
