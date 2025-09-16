package practice8.functionalInterface.Task3;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(5));
        System.out.println(isEven.test(6));
    }
}
