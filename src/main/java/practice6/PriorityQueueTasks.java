package practice6;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(5);
        System.out.println("Порядок удаления: ");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
