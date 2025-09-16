package practice8.streamApi.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 2, 7, 10, 10, 15));

        List uniqNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqNumbers);

    }
}
