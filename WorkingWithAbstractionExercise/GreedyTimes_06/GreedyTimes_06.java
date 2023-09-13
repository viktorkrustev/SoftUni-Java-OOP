package WorkingWithAbstractionExercise.GreedyTimes_06;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GreedyTimes_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] data = scanner.nextLine().split("\\s+");

        var items = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        int gem = 0;
        int cash = 0;

        for (int i = 0; i < data.length; i += 2) {
            String name = data[i];
            long quantity = Long.parseLong(data[i + 1]);

            String item = "";

            if (name.length() == 3) {
                item = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                item = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                item = "Gold";
            }

            if (item.equals("")) {
                continue;
            } else if (bagCapacity < items.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + quantity) {
                continue;
            }

            switch (item) {
                case "Gem":
                    if (!items.containsKey(item)) {
                        if (items.containsKey("Gold")) {
                            if (quantity > items.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (items.get(item).values().stream().mapToLong(e -> e).sum() + quantity > items.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!items.containsKey(item)) {
                        if (items.containsKey("Gem")) {
                            if (quantity > items.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (items.get(item).values().stream().mapToLong(e -> e).sum() + quantity > items.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!items.containsKey(item)) {
                items.put((item), new LinkedHashMap<String, Long>());
            }

            if (!items.get(item).containsKey(name)) {
                items.get(item).put(name, 0L);
            }


            items.get(item).put(name, items.get(item).get(name) + quantity);
            if (item.equals("Gold")) {
            } else if (item.equals("Gem")) {
                gem += quantity;
            } else if (item.equals("Cash")) {
                cash += quantity;
            }
        }

        for (var x : items.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }
}