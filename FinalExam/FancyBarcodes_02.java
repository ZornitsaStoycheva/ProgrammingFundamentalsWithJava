package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();

            String digitGroup = "";

            String regex = "@[#]+(?<barcode>[A-Z][A-Za-z0-9]{4,}[A-Z])@[#]+";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()) {
                String barcode = matcher.group("barcode");
                for (int j = 0; j < barcode.length(); j++) {
                    char digit = barcode.charAt(j);

                    if (Character.isDigit(digit)) {
                        digitGroup += digit;
                    }
                }

                if (digitGroup.equals("")) {
                    digitGroup += "00";
                }
                System.out.printf("Product group: %s%n", digitGroup);
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
