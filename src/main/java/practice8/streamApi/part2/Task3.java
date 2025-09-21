package practice8.streamApi.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "seven", "eighteen"));

        List stringsLengts = strings.stream()
                .map(n -> n.length())
                .collect(Collectors.toList());

        System.out.println(stringsLengts);
    }
}
