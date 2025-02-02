package TextProcessingExercise;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(scanner.nextLine());
        BigInteger n = new BigInteger(scanner.nextLine());

        BigInteger result = firstNum.multiply(n);

        System.out.println(result);
    }
}
