package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2_0_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = z; i <= 10; i++) {
            sum = n * i;
            System.out.printf("%d X %d = %d%n", n, i, sum);
        }
    }
}
