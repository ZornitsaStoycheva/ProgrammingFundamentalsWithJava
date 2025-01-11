package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConcatNames_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String sign = scanner.nextLine();

        System.out.println(firstName.concat(sign).concat(lastName));
    }
}
