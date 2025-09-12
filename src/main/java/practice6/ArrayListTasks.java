package practice6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ArrayListTasks {
    public static void main(String[] args) {
        System.out.println("Task1");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numbers.add(6);
        System.out.println(numbers);

        System.out.println("Task3");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("some");
        strings.add("random");
        strings.add("word");
        AtomicReference<String> maxLenghtString = new AtomicReference<>(strings.get(0));
        strings.forEach(string -> {
            if (string.length() > maxLenghtString.get().length()) {
                maxLenghtString.set(string);
            }
        });
        System.out.println("Самая длинная строка - " + maxLenghtString);
    }

}
