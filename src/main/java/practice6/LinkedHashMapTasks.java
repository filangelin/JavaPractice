package practice6;

import java.util.LinkedHashMap;

public class LinkedHashMapTasks {
    public static void main(String[] args) {
        System.out.println("Task 2");
        LinkedHashMap<String, String> contacts = new LinkedHashMap<>();
        contacts.put("Anna", "78003456789");
        contacts.put("Ivan", "78003456780");
        contacts.put("Petr", "78003456782");

        System.out.println("Все контакты " + contacts);
        System.out.println("Поиск контакта Анна - " + contacts.get("Anna"));
    }
}
