package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 1; i <= n ; i++) {
            BigDecimal digit = new BigDecimal(scanner.nextLine());
            sum = sum.add(digit);
        }

        System.out.println(sum);
    }
}
