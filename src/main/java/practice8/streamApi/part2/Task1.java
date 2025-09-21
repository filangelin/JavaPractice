package practice8.streamApi.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "seven", "eighteen"));

        List stringsMoreFive = strings.stream()
                .filter(n -> n.length() > 5)
                .collect(Collectors.toList());

        System.out.println(stringsMoreFive);
    }

}
