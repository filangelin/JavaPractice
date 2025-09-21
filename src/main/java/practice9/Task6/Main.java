package practice9.Task6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        threeParallelSum(array);
    }

    static void threeParallelSum(int[] array) throws InterruptedException {
        int length = array.length;

        SumThread part1 = new SumThread(array, 0, length / 3 * 1);
        SumThread part2 = new SumThread(array, length / 3 * 1, length / 3 * 2);
        SumThread part3 = new SumThread(array, length / 3 * 2, length);

        Thread t1 = new Thread(part1);
        Thread t2 = new Thread(part2);
        Thread t3 = new Thread(part3);

        ArrayList<Thread> threads = new ArrayList<>(List.of(t1, t2, t3));
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Поток 1" + " Кол-во обработанных элементов = " + part1.getCount() + " Сумма эл-ов = " + part1.getSum());
        System.out.println("Поток 2" + " Кол-во обработанных элементов = " + part2.getCount() + " Сумма эл-ов = " + part2.getSum());
        System.out.println("Поток 3" + " Кол-во обработанных элементов = " + part3.getCount() + " Сумма эл-ов = " + part3.getSum());


    }


}
