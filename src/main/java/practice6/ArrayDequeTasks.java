package practice6;

import java.util.ArrayDeque;
import java.util.List;

public class ArrayDequeTasks {
    public static void main(String[] args) {
        System.out.println("Task 1");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        System.out.println("\nTask 2");
        ArrayDeque<Integer> queue = new ArrayDeque<>(List.of(2, 3, 4));
        queue.addFirst(1);
        queue.addLast(5);
        System.out.println("Очередь после добавления в начало и конец - " + queue);
        System.out.println("Извлечение первого элемента - " + queue.removeFirst());
        System.out.println("Извлечение последнего элемента - " + queue.removeLast());


    }
}
