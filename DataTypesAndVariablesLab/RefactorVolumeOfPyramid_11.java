package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        System.out.printf("Length: %.2f", length);
        System.out.printf("Width: %.2f", width);
        System.out.printf("Height: %.2f", height);
        double volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);

    }
}
