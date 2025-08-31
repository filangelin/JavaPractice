package practice4;

import java.util.Scanner;

public class WhileTasksSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //calculateFactorial();
        //printEvenNumbers();
        printNumbersDesc();
    }

    static void calculateFactorial() {
        int number = scanner.nextInt();
        int result = 1;
        int i = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("Факториал " + number + " = " + result);
    }

    static void printEvenNumbers() {
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    static void printNumbersDesc() {
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println(number);
            number--;
        }
    }
}
