package practice8.streamApi.part3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 22, 7, 10, 10, 15));

        Integer maxElement = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(maxElement);

    }
}
