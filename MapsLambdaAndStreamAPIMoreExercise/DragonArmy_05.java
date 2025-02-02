package MapsLambdaAndStreamAPIMoreExercise;

import java.util.*;

public class DragonArmy_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<Integer>>> heroes = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputLine = input.split(" ");

                if (inputLine[2].equals("null")) {
                    inputLine[2] = "45";
                }

                if (inputLine[3].equals("null")) {
                    inputLine[3] = "250";
                }

                if (inputLine[4].equals("null")) {
                    inputLine[4] = "10";
                }

            String type = inputLine[0];
            String name = inputLine[1];
            int damage = Integer.parseInt(inputLine[2]);
            int heath = Integer.parseInt(inputLine[3]);
            int armour = Integer.parseInt(inputLine[4]);

            if (!heroes.containsKey(type)) {
                heroes.put(type, new TreeMap<>());
                heroes.get(type).put(name, new ArrayList<>());
                heroes.get(type).get(name).add(0, damage);
                heroes.get(type).get(name).add(1, heath);
                heroes.get(type).get(name).add(2, armour);
            } else {
                heroes.get(type).remove(name);
                heroes.get(type).put(name, new ArrayList<>());
                heroes.get(type).get(name).add(0, damage);
                heroes.get(type).get(name).add(1, heath);
                heroes.get(type).get(name).add(2, armour);
            }
        }

        heroes.forEach((key, value) -> {
            double damageAvr = 0.0;
            double heathAvr = 0.0;
            double armourAvr = 0.0;

            for(List<Integer> list : value.values()) {
                damageAvr += list.get(0);
                heathAvr += list.get(1);
                armourAvr += list.get(2);
            }

            damageAvr /= value.size();
            heathAvr /= value.size();
            armourAvr /= value.size();

            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", key, damageAvr, heathAvr, armourAvr);
            heroes.get(key).forEach((k, v) -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n",
                    k, v.get(0), v.get(1), v.get(2)));
        });
    }
}
