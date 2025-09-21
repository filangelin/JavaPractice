package practice8.streamApi.part3;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 22, 7, -7, 10, 15));

        Integer minElement = numbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println(minElement);

    }
}
