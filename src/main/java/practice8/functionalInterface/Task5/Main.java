package practice8.functionalInterface.Task5;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printString = System.out::println;
        printString.accept("Hello, world!");
    }
}
