package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());


        int countOfTargets = 0;

        double precent = n * 0.50;

        while (n >= m) {

           countOfTargets++;
           n -= m;

            if (n == precent && y != 0) {
                n /= y;
            }
        }

        System.out.println(n);
        System.out.println(countOfTargets);
    }
}
