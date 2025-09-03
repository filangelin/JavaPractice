package practice4;

import java.util.Scanner;

public class ForTasksSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //printMultiplyTable();
        //isPrimeNumber();
        printNumbers();
    }

    static void printNumbersDividingBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    static void printSum() {
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void printMultiplyTable() {
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + i * number);
        }
    }

    static void isPrimeNumber() {
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Число " + number + (isPrime ? " простое" : " непростое"));
    }

    static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


}
