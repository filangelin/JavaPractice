package practice6;

import java.util.LinkedHashSet;

public class LinkedHashSetTasks {
    public static void main(String[] args) {
        System.out.println("Task 1");
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("5");
        System.out.println("Проверка сохранения порядка вставки без дубликатов  " + strings);

    }
}
