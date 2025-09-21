package practice8.streamApi.part3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 22, 7, -7, 10, 15));

        Integer sum = numbers.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(sum);

    }
}
