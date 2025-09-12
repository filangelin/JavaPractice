package practice6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTasks {
    public static void main(String[] args) {
        System.out.println("Task 2");
        LinkedList<String> tasks = new LinkedList<>();
        tasks.addLast("1 task");
        tasks.addLast("2 task");
        tasks.addLast("3 task");

        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }

        System.out.println("Task 5");
        LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("В обратном порядке:");
        iterator = numbers.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nДругой способ:");
        ListIterator iter = numbers.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("В обратном порядке:");
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }

    }

}
