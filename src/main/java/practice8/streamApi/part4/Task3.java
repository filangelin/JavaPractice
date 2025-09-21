package practice8.streamApi.part4;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 5, 7, 10, 13, 15));

        Double averageNumber = numbers.stream()
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(averageNumber);
    }
}
