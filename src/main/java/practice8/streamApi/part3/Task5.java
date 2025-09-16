package practice8.streamApi.part3;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 1, 23, 7, -7));

        Boolean isEvenExists = numbers.stream()
                .anyMatch(n -> n % 2 == 0);
        System.out.println(isEvenExists);

    }
}
