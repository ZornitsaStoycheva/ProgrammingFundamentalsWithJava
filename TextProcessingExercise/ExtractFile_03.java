package TextProcessingExercise;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\\\");

        for (int i = 0; i < input.length; i++) {
            if (input[i].contains(".")) {
                String[] fileSystem = input[i].split("\\.");
                System.out.printf("File name: %s%n", fileSystem[0]);
                System.out.printf("File extension: %s", fileSystem[1]);
            }
        }
    }
}
