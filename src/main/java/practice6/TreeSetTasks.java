package practice6;

import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {
        System.out.println("Task3");
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);
        System.out.println("Заданное число = 4");
        System.out.println("Ближайшее наименьшее = " + numbers.lower(4));
        System.out.println("Ближайшее наибольшее = " + numbers.higher(4));

    }
}
