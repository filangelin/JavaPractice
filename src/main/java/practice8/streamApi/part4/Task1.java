package practice8.streamApi.part4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "Арбуз", "Банан", "seven", "Билет"));

        Map groupedStrings = strings.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));
        System.out.println(groupedStrings);
    }
}
