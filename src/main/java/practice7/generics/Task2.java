package practice7.generics;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    static <T> void printArray(ArrayList<T> array) {
        for (T elem : array) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        printArray(new ArrayList<>(List.of(1, 2, 3, 4, 5)));
        printArray(new ArrayList<>(List.of('a', 'b', 'c')));

    }
}
