package practice6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {
        System.out.println("Task2");
        HashMap<String, Integer> persons = new HashMap<>();
        persons.put("Ivan", 14);
        persons.put("Alexey", 18);
        persons.put("Petr", 17);
        persons.put("Anna", 24);
        persons.put("Eva", 39);
        System.out.println(persons);
        System.out.println(persons.containsKey("Ivan") ? "Имя Ivan сод-ся в HashMap" : "Имени Ivan нет в HashMap");

        System.out.println("Task3");
        System.out.println("Пользователи младше 18:");
        for (Map.Entry<String, Integer> person : persons.entrySet()) {
            if (person.getValue() < 18) {
                System.out.println(person.getKey());
            }
        }


    }
}
