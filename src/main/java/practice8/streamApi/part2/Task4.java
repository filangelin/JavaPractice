package practice8.streamApi.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(16, 2, 5, 7, 10, 13, 15));

        List numbersSquared = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(numbersSquared);
    }
}
