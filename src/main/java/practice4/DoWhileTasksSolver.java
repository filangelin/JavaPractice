package practice4;

import java.util.Scanner;

public class DoWhileTasksSolver {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //waifForPositiveNumber();
        //checkPassword();
        //printNumbers();
        //waitForExit();
        countDigits();
    }

    static void waifForPositiveNumber() {
        int number;
        do {
            System.out.println("Введите число");
            number = scanner.nextInt();
        } while (number <= 0);
    }

    static void checkPassword() {
        String password = "adminpass";
        String input;
        do {
            System.out.println("Введите пароль");
            input = scanner.next();
        } while (!password.equals(input));
    }

    static void printNumbers() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i<=10);
    }

    static void waitForExit() {
        String input;
        do {
            System.out.println("Введите команду");
            input = scanner.next();
        } while (!"exit".equals(input));
    }

    static void countDigits() {
        int number = scanner.nextInt();
        int count = 0;
        do {
            number /= 10;
            count++;
        } while (number > 0);

        System.out.println("В введенном числе цифр = " + count);
    }
}
