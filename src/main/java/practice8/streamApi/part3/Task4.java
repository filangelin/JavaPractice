package practice8.streamApi.part3;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "Арбуз", "Банан", "seven", "Билет"));

        String firstStartsWithB = strings.stream()
                .filter(n -> n.startsWith("Б"))
                .findFirst()
                .orElse(null);
        System.out.println(firstStartsWithB);

    }
}
