package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "%(?<name>[A-Z]{1}[a-z]+)%<(?<product>[A-Za-z]+)>\\|(?<quantity>[0-9]+)\\|(?<price>[0-9]+.?[0-9]+)";

        double totalPrice = 0.0;

        while (!input.equals("end of shift")) {

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));

                double total = quantity * price;

                totalPrice += total;

                System.out.printf("%s: %s - %.2f%n",name, product, total);
            }

            input= scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalPrice);
    }
}
