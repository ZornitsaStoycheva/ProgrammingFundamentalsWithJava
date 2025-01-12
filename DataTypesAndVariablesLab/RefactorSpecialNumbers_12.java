package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;
        boolean isTrue = false;
        for (int ch = 1; ch <= n; ch++) {
            count = ch;
            while (ch > 0) {
                sum += ch % 10;
                ch = ch / 10;
            }
            isTrue = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %b%n", count, isTrue);
            sum = 0;
            ch = count;

        }
    }
}
