package FinalExam;

import java.util.*;

public class ThePianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String[]>> pieces = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\|");
            String piece = input[0];

            if(!pieces.containsKey(piece)) {
                pieces.put(piece, new ArrayList<>());
                pieces.get(piece).add(new String[]{input[1], input[2]});
            } else {
                pieces.get(piece).add(new String[]{ input[1], input[2] });
            }
        }

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Stop")) {

            String[] commandLine = inputLine.split("\\|");
            String command = commandLine[0];
            String piece = commandLine[1];

            if (command.equals("Add")) {

                String compositor = commandLine[2];
                String key = commandLine[3];

                if (!pieces.containsKey(piece)) {
                    pieces.put(piece, new ArrayList<>());
                    pieces.get(piece).add(new String[] { compositor, key });

                    System.out.printf("%s by %s in %s added to the collection!%n", piece, compositor, key);
                } else {
                    System.out.printf("%s is already in the collection!%n", piece);
                }
            } else if (command.equals("Remove")) {

                if (pieces.containsKey(piece)) {
                    pieces.remove(piece);
                    System.out.printf("Successfully removed %s!%n", piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if (command.equals("ChangeKey")) {

                String newKey = commandLine[2];

                if (pieces.containsKey(piece)) {
                    List<String[]> list = pieces.get(piece);
                    String[] index = list.get(0);
                    index[1] = newKey;
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }

            inputLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<String[]>> entry : pieces.entrySet()) {
            for (String[] strings : entry.getValue()) {
                System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), strings[0], strings[1]);
            }
        }

    }
}
