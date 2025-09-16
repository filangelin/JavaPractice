package practice8.functionalInterface.Task4;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> stringLenght = String::length;
        System.out.println(stringLenght.apply("Test"));
    }
}
