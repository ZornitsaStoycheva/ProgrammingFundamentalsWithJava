package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SnowWhite_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> dwarfs = new HashMap<>();

        while (!input.equals("Once upon a time")) {

            String[] inputLine = input.split("\\s+<:>\\s+");

            String name = inputLine[0];
            String hatColor = inputLine[1];
            String physical = inputLine[2];

            if(!dwarfs.containsKey(hatColor)) {
                dwarfs.put(hatColor, new ArrayList<>());
                dwarfs.get(hatColor).add(0, name);
                dwarfs.get(hatColor).add(1, physical);
            } else {
                //int index = dwarfs.get(hatColor).indexOf(1);
                if (dwarfs.get(hatColor).get(0).equals(name)) {
                    String currentPhysical = dwarfs.get(hatColor).get(1);

                    if (Integer.parseInt(currentPhysical) < Integer.parseInt(physical)) {
                        dwarfs.get(hatColor).set(1, physical);
                    }
                } else {
                    dwarfs.get(hatColor).add(0, name);
                    dwarfs.get(hatColor).add(1, physical);
                }
            }

            input =scanner.nextLine();
        }

        System.out.println(dwarfs);


        for (Map.Entry<String, List<String>> entry : dwarfs.entrySet()) {
            int physical = Integer.parseInt(entry.getValue().get(1));

            List<String> list = entry.getValue();
            Collections.reverse(list);

            System.out.println(list);
        }

    }
}
