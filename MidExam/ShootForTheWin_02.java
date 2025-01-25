package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        int target = 0;

        while (!input.equals("End")) {

            int shoot = Integer.parseInt(input);

            boolean isValid = isValidIndex(shoot, arr);

            if (isValid) {
                int num = arr[shoot];

                for (int i = 0; i < arr.length; i++) {
                    if (num < arr[i] && arr[i] != -1) {
                        arr[i] -= num;
                    } else if (num >= arr[i] && arr[i] != -1) {
                        arr[i] += num;
                    }
                }
                arr[shoot] = -1;
                target++;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Shot targets: %d -> ", target);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static Boolean isValidIndex(int index, int[] arr) {
        return index >= 0 && index <= arr.length - 1;
    }
}
