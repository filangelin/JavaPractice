package practice8.streamApi.part4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 5, 7, 10, 13, 15));

        Map groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Четное" : "Нечетное"));
        System.out.println(groupedNumbers);
    }
}
