package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countTrashedHeadset = 0;
        int countTrashedMouse = 0;
        int countTrashedKeyboard = 0;
        int countTrashedDisplay = 0;

        for (int i = 1; i <= lostGameCount ; i++) {
            if (i % 2 == 0) {
                countTrashedHeadset++;
            }

            if (i % 3 == 0) {
                countTrashedMouse++;

                if (countTrashedMouse % 2 == 0) {
                    countTrashedKeyboard++;

                    if (countTrashedHeadset % 2 == 0) {
                        countTrashedDisplay++;
                    }
                }
            }


        }

        double price = countTrashedHeadset * headsetPrice +
                countTrashedMouse * mousePrice +
                countTrashedKeyboard * keyboardPrice +
                countTrashedDisplay * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", price);
    }
}
