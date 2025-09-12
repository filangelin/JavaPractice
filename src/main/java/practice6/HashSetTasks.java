package practice6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTasks {
    public static void main(String[] args) {
        System.out.println("Task 3");
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 3, 4, 5, 5, 6));
        System.out.println("Изначальный лист: " + numbers);
        System.out.println("Лист без дубликатов: " + uniqElements(numbers));

        System.out.println("\nTask 4");
        HashSet<String> names = new HashSet<>();
        names.add("Kolya");
        names.add("Sveta");
        names.add("Alina");
        names.add("Pavel");
        names.add("Angelina");
        System.out.println(names.contains("Angelina") ? "Имя сод-ся в множестве" : "Имени в множестве нет");
        names.remove("Angelina");
        System.out.println("Вывод после удаления:");
        System.out.println(names.contains("Angelina") ? "Имя сод-ся в множестве" : "Имени в множестве нет");

    }

    public static Set uniqElements(List elements) {
        return new HashSet<>(elements);
    }

}
