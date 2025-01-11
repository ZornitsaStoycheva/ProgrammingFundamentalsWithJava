package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double allPriceOfLightSabers = (Math.ceil(countOfStudents + (countOfStudents * 0.10))) * priceOfLightSabers;
        double countOfBelts = countOfStudents;
        countOfBelts = Math.floor(countOfBelts / 6);

        double money = allPriceOfLightSabers + (countOfStudents * priceOfRobes) +
                ((countOfStudents - countOfBelts) * priceOfBelts);

        if (money <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", money);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", money - amountOfMoney);
        }
    }
}
