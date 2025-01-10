package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class ForeignLanguages_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();

        if (country.equals("USA") || country.equals("England")) {
            System.out.print("English");
        } else if (country.equals("Spain") || country.equals("Mexico") || country.equals("Argentina")) {
            System.out.print("Spanish");
        } else {
            System.out.print("unknown");
        }
    }
}
