package practice6;

import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        System.out.println("Task 2");
        TreeMap<String, Integer> marks = new TreeMap<>();
        marks.put("Ivan", 3);
        marks.put("Petr", 4);
        marks.put("Anna", 5);
        System.out.println("Минимальный ключ - " + marks.firstKey());
        System.out.println("Максимальный ключ - " + marks.lastKey());

    }
}
