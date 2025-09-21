package practice8.streamApi.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 5, 7, 10, 13, 15));

        List dividedByFive = numbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(dividedByFive);
    }
}
