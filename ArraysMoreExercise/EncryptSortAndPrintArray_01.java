package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        for (int k = 0; k < arr.length; k++) {
            String name = scanner.nextLine();
            //int sum = 0;

            for (int i = 0; i < n; i++) {
                int sum = 0;
            int lengthName = name.length();
            for (int j = 0; j < name.length(); j++) {
                int symbolNum = name.charAt(j);
                char symbol = name.charAt(j);
                if (symbol == 'a' || symbol == 'e' || symbol == 'o'
                        || symbol == 'u' || symbol == 'i'
                        || symbol == 'A' || symbol == 'E' || symbol == 'O'
                        || symbol == 'U' || symbol == 'I') {
                    sum += symbolNum * lengthName;
                } else {
                    sum += symbolNum / lengthName;
                }
            }
            arr[i] = sum;
            }

//            for (int j = 0; j < arr.length; j++) {
//                arr[i] = sum;
//            }

            Arrays.sort(arr);

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[k]);
            }
        }
    }
}
