package ArraysLab;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");

        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
